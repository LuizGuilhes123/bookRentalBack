package com.guilhermebraga.bookrental.repositories;

;
import com.guilhermebraga.bookrental.entities.PublishersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishersRepository extends JpaRepository<PublishersEntity, Integer> {
    boolean existsByName(String publisherName);

    boolean existsByNameAndIdNot(String name, Integer id);
}