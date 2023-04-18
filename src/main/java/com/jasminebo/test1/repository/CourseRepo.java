package com.jasminebo.test1.repository;

import com.jasminebo.test1.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CourseRepo extends CrudRepository<CourseEntity, Integer> {

    List<CourseEntity> findByAuthor(String author);
    List<CourseEntity> findByName(String name);
    CourseEntity findById(int id);

    List<CourseEntity> findAll();
}
