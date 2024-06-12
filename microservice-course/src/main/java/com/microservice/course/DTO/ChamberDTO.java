package com.microservice.course.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChamberDTO {

    private String name;
    private String lastName;
    private String email;
    private Long courseId;

}
