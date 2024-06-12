package com.microservice.course.Service;

import com.microservice.course.DTO.ChamberDTO;
import com.microservice.course.Entities.Course;
import com.microservice.course.HTTP.Response.ChambersByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    ChambersByCourseResponse findChambersByIdCourse(Long idCourse);

}
