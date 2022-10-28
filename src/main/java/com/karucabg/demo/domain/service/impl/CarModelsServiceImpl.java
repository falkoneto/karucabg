package com.karucabg.demo.domain.service.impl;

import com.karucabg.demo.domain.model.CarModel;
import com.karucabg.demo.domain.service.CarModelsService;
import com.karucabg.demo.persistence.repository.CarModelRepository;
import org.springframework.stereotype.Service;

@Service
public class CarModelsServiceImpl implements CarModelsService {

    private final CarModelRepository carModelRepository;

    public CarModelsServiceImpl(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }


    @Override
    public CarModel createCarModel(CarModel carModel) {
        return carModelRepository.save(carModel);
    }
}
