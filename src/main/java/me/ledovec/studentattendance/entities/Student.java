package me.ledovec.studentattendance.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Table(name = "students")
@Entity
@Getter
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long id;
    @Column(name = "first_name")  private String firstName;
    @Column(name = "last_name") private String lastName;

}
