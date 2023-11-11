package com.Healthcare.BookingApplication.Service;

import java.util.List;
//import java.util.Optional;

//import org.springframework.stereotype.Service;
import com.Healthcare.BookingApplication.Entity.Doctor;


public interface DoctorService {

    List<Doctor> findAllDoctors();
    Doctor findDoctorById(Long id);
   
    Doctor saveDoctor(Doctor doctor);
    
}
