package com.fintechlabs.auditlogs.model;

import com.fintechlabs.auditlogs.audit.AuditAware;
import com.fintechlabs.auditlogs.audit.AuditLogListener;
import lombok.Data;
import lombok.NoArgsConstructor;



import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@EntityListeners(value = {AuditLogListener.class})

@Validated
@Entity
public class Applicant implements Serializable, AuditAware {

    
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    
    

}
