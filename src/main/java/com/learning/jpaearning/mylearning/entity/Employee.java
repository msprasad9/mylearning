package com.learning.jpaearning.mylearning.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private long salary;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Department department;
}
