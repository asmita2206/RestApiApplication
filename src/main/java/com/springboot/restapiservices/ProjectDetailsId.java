package com.springboot.restapiservices;

import javax.persistence.Id;
import java.io.Serializable;

public class ProjectDetailsId implements Serializable {

    private Long companyId;
    private Long clientId;
    private Long projectNumber;

    public ProjectDetailsId() {
    }


    public ProjectDetailsId(Long companyId, Long clientId, Long projectNumber) {
        this.companyId = companyId;
        this.clientId = clientId;
        this.projectNumber = projectNumber;
    }
}
