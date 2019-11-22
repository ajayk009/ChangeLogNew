package com.fintechlabs.auditlogs.repository;

import com.fintechlabs.auditlogs.model.AuditTrail;

import org.springframework.data.jpa.repository.JpaRepository;
;

public interface AuditTrailRepository extends JpaRepository<AuditTrail, Long> 
{
	// this is repository
}
