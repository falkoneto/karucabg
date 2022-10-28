package com.karucabg.demo.rest.dto;

import com.karucabg.demo.domain.model.CarModel;

import java.util.UUID;

public record CarModelDTO(Integer id,
                          Integer manufacturerId,
                          String name) {

    public CarModel toModel() {
        return new CarModel(id, manufacturerId, name);
    }

    public static CarModelDTO fromModel(CarModel carModel) {

        return new CarModelDTO(carModel.getId(),
                carModel.getManufacturerId(),
                carModel.getName());
    }

}

