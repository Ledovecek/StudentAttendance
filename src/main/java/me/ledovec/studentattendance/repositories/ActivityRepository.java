package me.ledovec.studentattendance.repositories;

import me.ledovec.studentattendance.entities.StudentActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<StudentActivity, Long> {

    long getStudentActivitiesByStudentId(long id);

}
