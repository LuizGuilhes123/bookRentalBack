package com.guilhermebraga.bookrental.services.publishers;


import com.guilhermebraga.bookrental.entities.PublishersEntity;
import com.guilhermebraga.bookrental.io.publishers.PublishersCreateRequest;
import com.guilhermebraga.bookrental.io.publishers.PublishersUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublishersService {

    void create(PublishersCreateRequest publishersCreateRequest);

    List<PublishersUpdateRequest> getAll();

    PublishersEntity findById(Integer id);

    void delete(Integer id);

    void update(PublishersUpdateRequest publishersUpdateRequest);
}