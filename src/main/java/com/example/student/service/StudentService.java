package com.example.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private RestTemplate restTemplate;

    private final String COURSE_SERVICE_URL = "http://localhost:8081/api/courses";  // Course Microservice URL

    // Method to fetch courses for a student from the Course Microservice
    public List<Object> getStudentCourses() {
        Object[] courses = restTemplate.getForObject(COURSE_SERVICE_URL, Object[].class);
        return Arrays.asList(courses);
    }
}
