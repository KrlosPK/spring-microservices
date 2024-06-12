package com.microservice.chamber.Controller;

import com.microservice.chamber.Entities.Chamber;
import com.microservice.chamber.Service.IChamberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chamber")
public class ChamberController {

    @Autowired
    private IChamberService chamberService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveChamber(@RequestBody Chamber chamber) {
        chamberService.save(chamber);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllChambers() {
        return ResponseEntity.ok(chamberService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(chamberService.findById(id));
    }

    @GetMapping("/search-by-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(chamberService.findByIdCourse(idCourse));
    }

}
