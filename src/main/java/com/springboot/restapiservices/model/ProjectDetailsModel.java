package com.springboot.restapiservices.model;

import com.springboot.restapiservices.ProjectDetailsId;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@IdClass(ProjectDetailsId.class)
@Table(name = "project_details")
public class ProjectDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long companyId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectNumber;
    private String projectName;
    private String clientName;


    public ProjectDetailsModel() {
    }

    public ProjectDetailsModel(String projectName, String clientName) {
        this.projectName = projectName;
        this.clientName = clientName;
    }




    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(Long projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "ProjectDetailsModel{" +
                "companyId='" + companyId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", projectNumber='" + projectNumber + '\'' +
                ", projectName='" + projectName + '\'' +
                ", clientname='" + clientName + '\'' +
                '}';
    }
}
