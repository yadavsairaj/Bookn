package com.Healthcare.BookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Healthcare.BookingApplication.Entity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    
} 
