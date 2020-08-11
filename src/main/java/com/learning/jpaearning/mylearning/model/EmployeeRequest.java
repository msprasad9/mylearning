package com.learning.jpaearning.mylearning.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private long salary;

    private Department department;

}
