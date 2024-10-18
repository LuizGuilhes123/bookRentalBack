package com.guilhermebraga.bookrental.services.books;



import com.guilhermebraga.bookrental.entities.BooksEntity;
import com.guilhermebraga.bookrental.io.books.BookMostRentResponseRequest;
import com.guilhermebraga.bookrental.io.books.BooksCreateRequest;
import com.guilhermebraga.bookrental.io.books.BooksResponseRequest;
import com.guilhermebraga.bookrental.io.books.BooksUpdateRequest;

import java.util.List;

public interface BooksService {

    BooksEntity findById(Integer id);

    void create(BooksCreateRequest booksCreateRequest);

    List<BooksResponseRequest> getAll();

    List<BookMostRentResponseRequest> getMostRentBooks();

    void delete(Integer id);

    void update(BooksUpdateRequest booksUpdateRequest);
}
