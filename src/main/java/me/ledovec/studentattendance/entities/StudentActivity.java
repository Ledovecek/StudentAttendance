package me.ledovec.studentattendance.entities;

import jakarta.persistence.*;
import lombok.Getter;
import me.ledovec.studentattendance.enums.RecordType;

@Entity
@Getter
@Table(name = "student_activity")
public class StudentActivity {

    @Id @Column private long id;
    @Column(name = "student_id") private long studentId;
    @Column(name = "type") private RecordType recordType;
    @Column private long timestamp;

}
