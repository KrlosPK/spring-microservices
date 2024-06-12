package com.microservice.chamber.Service;

import com.microservice.chamber.Entities.Chamber;

import java.util.List;

public interface IChamberService {

    List<Chamber> findAll();

    Chamber findById(Long id);

    void save(Chamber chamber);

    List<Chamber> findByIdCourse(Long idCourse);

}
