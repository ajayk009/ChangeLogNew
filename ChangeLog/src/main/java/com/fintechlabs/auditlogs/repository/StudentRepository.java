package com.fintechlabs.auditlogs.repository;





import org.springframework.data.jpa.repository.JpaRepository;


import com.fintechlabs.auditlogs.model.Applicant;


public interface StudentRepository extends JpaRepository<Applicant,Long> {



}
