package com.microservice.chamber.Persistence;

import com.microservice.chamber.Entities.Chamber;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChamberRepository extends CrudRepository<Chamber, Long> {

    @Query("SELECT c FROM Chamber c WHERE c.courseId = :idCourse")
    List<Chamber> findAllChamber(Long idCourse);

    // Ambas hacen lo mismo, se pueden utilizar las dos
    // List<Chamber> findAllByCourseId(Long idCourse);

}
