package com.microservice.chamber.Service;

import com.microservice.chamber.Entities.Chamber;
import com.microservice.chamber.Persistence.ChamberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamberServiceImpl implements IChamberService {

    @Autowired
    private ChamberRepository chamberRepository;

    @Override
    public List<Chamber> findAll() {
        return (List<Chamber>) chamberRepository.findAll();
    }

    @Override
    public Chamber findById(Long id) {
        return chamberRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Chamber chamber) {
        chamberRepository.save(chamber);
    }

    @Override
    public List<Chamber> findByIdCourse(Long idCourse) {
        return chamberRepository.findAllChamber(idCourse);
    }
}
