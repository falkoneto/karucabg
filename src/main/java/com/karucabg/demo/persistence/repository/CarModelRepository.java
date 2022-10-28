package com.karucabg.demo.persistence.repository;

import com.karucabg.demo.domain.model.CarModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarModelRepository extends  CrudRepository<CarModel, Integer>{


}
