package com.guilhermebraga.bookrental.io.books;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BooksCreateRequest {

    private String name;

    private String author;

    private Integer publisherId;

    private Integer releaseYear;

    private Integer amount;

}
