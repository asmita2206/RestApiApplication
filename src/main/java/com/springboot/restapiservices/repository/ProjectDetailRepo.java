package com.springboot.restapiservices.repository;

import com.springboot.restapiservices.model.ProjectDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDetailRepo extends JpaRepository<ProjectDetailsModel,String> {
}
