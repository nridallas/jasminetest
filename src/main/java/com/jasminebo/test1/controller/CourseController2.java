package com.jasminebo.test1.controller;

import com.jasminebo.test1.entity.CourseEntity;
import com.jasminebo.test1.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController2 {
    @Autowired
    CourseRepo courseRepo;
    @GetMapping("/course")
    public Optional<CourseEntity> getId(@RequestParam(value = "id", defaultValue = "World") Integer id) {
        return courseRepo.findById(id);
    }

    @GetMapping("/coursename")
    public List<CourseEntity> getName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return courseRepo.findByName(name);
    }

    @GetMapping("/courseauthor")
    public List<CourseEntity> getAuthor(@RequestParam(value = "author", defaultValue = "World") String author) {
        return courseRepo.findByAuthor(author);
    }

    @GetMapping("/course/all1")
    public List<CourseEntity> getAllCourses() {
        return courseRepo.findAll();
    }

    @PostMapping("/course")
    public CourseEntity createCourse(@RequestBody CourseEntity newCourseEntity) {
        return courseRepo.save(newCourseEntity);
    }

    @PutMapping("/course")
    public CourseEntity updateCourse(@RequestBody CourseEntity newCourseEntity) {
        return courseRepo.save(newCourseEntity);
    }

    @DeleteMapping("/course")
    public void deleteCourse(@RequestBody CourseEntity existingCourseEntity) {
        courseRepo.delete(existingCourseEntity);
    }

    @DeleteMapping("/course/delete")
    public void deleteById(@RequestParam(value = "id", defaultValue = "World") Integer id) {
        courseRepo.deleteById(id);
    }
}
