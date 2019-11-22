package com.fintechlabs.auditlogs.dto;


import com.fintechlabs.auditlogs.model.Applicant;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public StudentDTO(Applicant applicant) {
        this.id = applicant.getId();
        this.firstName = applicant.getFirstName();
        this.lastName = applicant.getLastName();
        this.phoneNumber = applicant.getPhoneNumber();
        this.emailAddress = applicant.getEmailAddress();
    }

}
