package com.fintechlabs.auditlogs.controller;

import com.fintechlabs.auditlogs.model.Applicant;
import com.fintechlabs.auditlogs.repository.StudentRepository;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/applicant")
public class ApplicantController {

	private final StudentRepository studentRepository;

	public ApplicantController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@PostMapping("/save")
	public Applicant createStudent(@Valid @RequestBody Applicant student) {
		return studentRepository.save(student);
	}

	@PutMapping("/update/{id}")
	public Applicant updateStudent(@PathVariable(value = "id") Long studentId,

			@Valid @RequestBody Applicant studentDetails) {

		Applicant student = studentRepository.findById(studentDetails.getId()).get();

		student.setEmailAddress(studentDetails.getEmailAddress());
		student.setFirstName(studentDetails.getFirstName());
		student.setLastName(studentDetails.getLastName());
		student.setPhoneNumber(studentDetails.getPhoneNumber());
		Applicant updatedStudent = studentRepository.save(student);
		return updatedStudent;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Applicant studentDetails) {
		Applicant student = studentRepository.findById(studentDetails.getId()).get();

		studentRepository.delete(student);

		return ResponseEntity.ok().build();
	}

}
