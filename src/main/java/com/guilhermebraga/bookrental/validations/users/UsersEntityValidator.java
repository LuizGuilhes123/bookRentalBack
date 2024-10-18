package com.guilhermebraga.bookrental.validations.users;


import com.guilhermebraga.bookrental.entities.UsersEntity;
import com.guilhermebraga.bookrental.io.users.UsersUpdateRequest;

public interface UsersEntityValidator {
    void validateForCreateUsers(UsersEntity entity);

    void validateForDeleteUsers(Integer id);

    void validateForUpdateUsers(UsersEntity entity, UsersUpdateRequest usersUpdateRequest);
}
