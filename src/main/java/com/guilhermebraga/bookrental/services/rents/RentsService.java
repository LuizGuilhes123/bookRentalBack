package com.guilhermebraga.bookrental.services.rents;



import com.guilhermebraga.bookrental.entities.RentsEntity;
import com.guilhermebraga.bookrental.io.rents.RentTotalByStatusResponseRequest;
import com.guilhermebraga.bookrental.io.rents.RentsCreateRequest;
import com.guilhermebraga.bookrental.io.rents.RentsResponseRequest;

import java.util.List;

public interface RentsService {

    RentsEntity findById(Integer id);

    List<RentsResponseRequest> getAll();

    void create(RentsCreateRequest rentsCreateRequest);

    List<RentTotalByStatusResponseRequest> getTotalByStatus();

    void returnRent(Integer id);
}
