package com.microservice.course.HTTP.Response;

import com.microservice.course.DTO.ChamberDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChambersByCourseResponse {

    private String courseName;
    private String teacher;
    private List<ChamberDTO> chamberDTOList;

}
