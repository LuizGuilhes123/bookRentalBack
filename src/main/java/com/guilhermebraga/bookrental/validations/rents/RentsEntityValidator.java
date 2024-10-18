package com.guilhermebraga.bookrental.validations.rents;


import com.guilhermebraga.bookrental.entities.RentsEntity;

public interface RentsEntityValidator {

    void validateForCreate(RentsEntity entity);

    void validateForGiveback(Integer id);
}
