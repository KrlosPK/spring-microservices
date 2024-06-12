package com.microservice.course.Client;

import com.microservice.course.DTO.ChamberDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-chamber", url = "localhost:8080/api/chamber")
public interface ChamberClient {

    @GetMapping("/search-by-course/{idCourse}")
    List<ChamberDTO> findAllChambersByCourse(@PathVariable Long idCourse);

}
