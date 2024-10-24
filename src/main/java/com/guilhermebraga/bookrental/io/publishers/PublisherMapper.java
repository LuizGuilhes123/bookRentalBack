package com.guilhermebraga.bookrental.io.publishers;


import com.guilhermebraga.bookrental.entities.PublishersEntity;
import com.guilhermebraga.bookrental.services.publishers.PublishersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublisherMapper {

    @Autowired
    private PublishersService publishersService;

    public PublishersUpdateRequest toPublisherDto(PublishersEntity publishersEntity) {
        PublishersUpdateRequest publishersUpdateRequest = new PublishersUpdateRequest();
        BeanUtils.copyProperties(publishersEntity, publishersUpdateRequest);
        return publishersUpdateRequest;
    }

    public PublishersEntity toPublisherEntity(PublishersUpdateRequest request) {
        PublishersEntity entity = publishersService.findById(request.getId());
        BeanUtils.copyProperties(request, entity);
        return entity;
    }

}