package com.guilhermebraga.bookrental.io.rents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentsUpdateRequest {

    private Integer id;

    private Integer userId;

    private Integer bookId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate forecastDate;

}
