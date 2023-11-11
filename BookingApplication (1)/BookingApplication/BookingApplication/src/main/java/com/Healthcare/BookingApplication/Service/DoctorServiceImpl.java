package com.Healthcare.BookingApplication.Service;

import java.util.List;
//import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Healthcare.BookingApplication.Entity.Doctor;
import com.Healthcare.BookingApplication.Exception.UserNotFoundException;
import com.Healthcare.BookingApplication.Repository.DoctorRepository;



@Service
public class DoctorServiceImpl implements DoctorService{

    
    private DoctorRepository doctorRepository;

    // @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }
    @Override
    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor findDoctorById(Long id){
        return doctorRepository.findById(id)
        .orElseThrow(()-> new UserNotFoundException("Doctor not found with id: " + id));
    }
    



    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    
}
