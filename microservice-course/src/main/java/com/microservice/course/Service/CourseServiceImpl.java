package com.microservice.course.Service;

import com.microservice.course.Client.ChamberClient;
import com.microservice.course.DTO.ChamberDTO;
import com.microservice.course.Entities.Course;
import com.microservice.course.HTTP.Response.ChambersByCourseResponse;
import com.microservice.course.Persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private ChamberClient chamberClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public ChambersByCourseResponse findChambersByIdCourse(Long idCourse) {
        Course course = courseRepository.findById(idCourse).orElse(new Course());

        List<ChamberDTO> chamberDTOList = chamberClient.findAllChambersByCourse(idCourse);

        return ChambersByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .chamberDTOList(chamberDTOList)
                .build();
    }

}
