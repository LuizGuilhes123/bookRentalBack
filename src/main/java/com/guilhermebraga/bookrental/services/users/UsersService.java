package com.guilhermebraga.bookrental.services.users;



import com.guilhermebraga.bookrental.entities.UsersEntity;
import com.guilhermebraga.bookrental.io.users.UsersCreateRequest;
import com.guilhermebraga.bookrental.io.users.UsersUpdateRequest;

import java.util.List;

public interface UsersService {
    void create(UsersCreateRequest usersCreateRequest);

    UsersEntity findById(Integer id);

    List<UsersUpdateRequest> getAll();

    void delete(Integer id);

    void update(UsersUpdateRequest usersUpdateRequest);
}
