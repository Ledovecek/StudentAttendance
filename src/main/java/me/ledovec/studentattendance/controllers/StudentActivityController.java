package me.ledovec.studentattendance.controllers;

import me.ledovec.studentattendance.entities.StudentActivity;
import me.ledovec.studentattendance.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("activity")
public class StudentActivityController {

    @Autowired
    private ActivityRepository activityRepository;

    @PostMapping
    public StudentActivity postActivity(@RequestBody StudentActivity studentActivity) {
        return activityRepository.save(studentActivity);
    }

}
