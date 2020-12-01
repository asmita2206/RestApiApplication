package com.springboot.restapiservices.controller;

import com.springboot.restapiservices.model.ProjectDetailsModel;
import com.springboot.restapiservices.repository.ProjectDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectDetailController {

    @Autowired
    ProjectDetailRepo projectDetailRepo;

    @PostMapping("/saveDetails")
    public String insertProjectDetails(@RequestBody ProjectDetailsModel projectDetailsModel){
           projectDetailRepo.save(projectDetailsModel);
           return "your record is saved successfully !!";
    }
}
