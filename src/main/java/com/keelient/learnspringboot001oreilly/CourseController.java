package com.keelient.learnspringboot001oreilly;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping(path = "courses")
@RestController
public class CourseController {

    @GetMapping("/")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28Minutes"),
                new Course(2, "Learn DevOps", "in28Minutes"),
                Course.builder()
                       .id(3)
                       .name("Learn Spring Boot")
                       .author("in28Minutes")
                       .build(),
                new Course(4, "Learn Azure", "in28Minutes")
        );
    }
}
