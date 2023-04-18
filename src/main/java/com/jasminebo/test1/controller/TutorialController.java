package com.jasminebo.test1.controller;

import com.jasminebo.test1.entity.Tutorial;
import com.jasminebo.test1.repository.TutorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TutorialController {
    @Autowired
    TutorialRepo tutorialRepo;

    @GetMapping("/tutorial")
    public List<Tutorial> getPublished(@RequestParam(value = "published", defaultValue = "World") String published) {
        return tutorialRepo.findByPublished(published);
    }

    @GetMapping("/tutorialtitle")
    public List<Tutorial> getTitle(@RequestParam(value = "title", defaultValue = "") String title) {
        return tutorialRepo.findByTitleContaining(title.toLowerCase());
    }
}
