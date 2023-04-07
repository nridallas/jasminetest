package com.jasminebo.test1.controller;

import com.jasminebo.test1.entity.CourseEntity;
import com.jasminebo.test1.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController2 {
    @Autowired
    CourseRepo courseRepo;
    @GetMapping("/course1")
    public Optional<CourseEntity> getId(@RequestParam(value = "id", defaultValue = "World") Integer id) {
        return courseRepo.findById(id);
    }

    @GetMapping("/course2")
    public List<CourseEntity> getName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return courseRepo.findByName(name);
    }

    @GetMapping("/course3")
    public List<CourseEntity> getAuthor(@RequestParam(value = "author", defaultValue = "World") String author) {
        return courseRepo.findByAuthor(author);
    }
}
