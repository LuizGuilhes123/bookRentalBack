package com.guilhermebraga.bookrental.io.rents;


import com.guilhermebraga.bookrental.entities.RentsEntity;
import com.guilhermebraga.bookrental.services.rents.RentsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RentMapper {

    @Autowired
    RentsService rentsService;

    public RentsResponseRequest toRentDto(RentsEntity rentsEntity) {
        RentsResponseRequest rentsResponseRequest = new RentsResponseRequest();
        rentsResponseRequest.setUserName(rentsEntity.getUser().getName());
        rentsResponseRequest.setBookName(rentsEntity.getBook().getName());
        rentsResponseRequest.setForecastDate(rentsResponseRequest.getForecastDate());
        rentsResponseRequest.setRentalDate(rentsResponseRequest.getRentalDate());
        rentsResponseRequest.setReturnDate(rentsResponseRequest.getReturnDate());
        return rentsResponseRequest;
    }

    public RentsEntity toBookEntity(RentsUpdateRequest request) {
        RentsEntity entity = rentsService.findById(request.getId());
        BeanUtils.copyProperties(request, entity);
        return entity;
    }

}