package com.guilhermebraga.bookrental.validations.publishers;


import com.guilhermebraga.bookrental.entities.PublishersEntity;
import com.guilhermebraga.bookrental.io.publishers.PublishersUpdateRequest;

public interface PublishersEntityValidator {
    void validateForCreatePublishers(PublishersEntity entity);

    void validateForDeletePublishers(Integer id);

    void validateForUpdatePublishers(PublishersEntity entity, PublishersUpdateRequest updateRequest);
}
