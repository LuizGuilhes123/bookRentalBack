package com.guilhermebraga.bookrental.services.publishers.impl;



import com.guilhermebraga.bookrental.entities.PublishersEntity;
import com.guilhermebraga.bookrental.exceptions.NotFoundExceptions;
import com.guilhermebraga.bookrental.io.publishers.PublishersCreateRequest;
import com.guilhermebraga.bookrental.io.publishers.PublishersUpdateRequest;
import com.guilhermebraga.bookrental.repositories.PublishersRepository;
import com.guilhermebraga.bookrental.services.publishers.PublishersService;
import com.guilhermebraga.bookrental.validations.publishers.PublishersEntityValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PublishersServiceImpl implements PublishersService {
    @Autowired
    private PublishersRepository publishersRepository;

    @Autowired
    private PublishersEntityValidator publishersEntityValidator;


    @Override
    public void create(PublishersCreateRequest publishersCreateRequest) {
        PublishersEntity entity = new PublishersEntity();
        entity.setName(publishersCreateRequest.getName().trim());
        entity.setCity(publishersCreateRequest.getCity().trim());
        publishersEntityValidator.validateForCreatePublishers(entity);
        publishersRepository.save(entity);
    }

    @Override
    public List<PublishersUpdateRequest> getAll() {
        List<PublishersEntity> publishers = publishersRepository.findAll();
        return publishers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private PublishersUpdateRequest convertToDto(PublishersEntity publishersEntity) {
        PublishersUpdateRequest publishersUpdateRequest = new PublishersUpdateRequest();
        BeanUtils.copyProperties(publishersEntity, publishersUpdateRequest);
        return publishersUpdateRequest;
    }

    @Override
    public void delete(Integer id) {
        PublishersEntity entity = findById(id);
        publishersEntityValidator.validateForDeletePublishers(id);
        publishersRepository.delete(entity);
    }

    @Override
    public void update(PublishersUpdateRequest publishersUpdateRequest) {
        PublishersEntity entity = findById(publishersUpdateRequest.getId() == null ? 0 : publishersUpdateRequest.getId());
        entity.setName(publishersUpdateRequest.getName().trim());
        entity.setCity(publishersUpdateRequest.getCity().trim());
        publishersEntityValidator.validateForUpdatePublishers(entity, publishersUpdateRequest);
        publishersRepository.save(entity);
    }

    @Override
    public PublishersEntity findById(Integer id) {
        if (id == null) {
            throw new NotFoundExceptions("Editora", 0);
        }
        return publishersRepository.findById(id)
                .orElseThrow(() -> new NotFoundExceptions("Editora",id));
    }
}
