package com.learning.jpaearning.mylearning.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dept_name")
    private String deptName;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch=FetchType.LAZY)
//    private List<Employee> employeeList;

}
