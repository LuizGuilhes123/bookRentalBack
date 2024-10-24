package com.guilhermebraga.bookrental.io.publishers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PublishersUpdateRequest {

    private Integer id;

    private String name;

    private String city;

}