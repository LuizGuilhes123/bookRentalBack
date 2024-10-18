package com.guilhermebraga.bookrental.repositories;


import com.guilhermebraga.bookrental.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
    boolean existsByName(String name);

    boolean existsByEmail(String name);

    boolean existsByEmailAndIdNot(String email, Integer id);
}