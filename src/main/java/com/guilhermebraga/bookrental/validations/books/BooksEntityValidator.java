package com.guilhermebraga.bookrental.validations.books;


import com.guilhermebraga.bookrental.entities.BooksEntity;

public interface BooksEntityValidator {
    void validateForCreateBooks(BooksEntity entity);

    void validateForDeleteBook(Integer id);

    void validateForUpdateBooks(BooksEntity entity);
}
