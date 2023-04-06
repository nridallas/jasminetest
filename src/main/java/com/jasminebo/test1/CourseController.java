package com.jasminebo.test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Courses> retrieveAllCourses() {
        return Arrays.asList(
                new Courses(1, "Learn AWS", "in28minuates"),
                new Courses(2, "Learn DevOps", "in28minutes"));
    }
}
