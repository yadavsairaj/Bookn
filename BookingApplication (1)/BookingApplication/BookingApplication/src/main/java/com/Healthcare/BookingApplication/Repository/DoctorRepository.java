package com.Healthcare.BookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Healthcare.BookingApplication.Entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    
} 
