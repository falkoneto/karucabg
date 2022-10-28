package com.karucabg.demo.rest;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PostMapping;

import com.karucabg.demo.domain.model.CarModel;
import com.karucabg.demo.domain.service.CarModelsService;
import com.karucabg.demo.rest.dto.CarModelDTO;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/carmodels")
public class CarModelsController {

    private final CarModelsService carModelsService;

    public CarModelsController(CarModelsService carModelsService) {
        this.carModelsService = carModelsService;
    }

    @PostMapping
    public CarModelDTO createCarModel (@RequestBody CarModelDTO carModelDTO){
       CarModel carModel =  carModelsService.createCarModel(carModelDTO.toModel());
       return CarModelDTO.fromModel(carModel);
    }


}
