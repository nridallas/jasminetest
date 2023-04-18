package com.jasminebo.test1.repository;


import com.jasminebo.test1.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepo extends JpaRepository<Tutorial, Integer> {
    List<Tutorial> findByPublished(String published);
    List<Tutorial> findByTitleContaining(String title);
}

