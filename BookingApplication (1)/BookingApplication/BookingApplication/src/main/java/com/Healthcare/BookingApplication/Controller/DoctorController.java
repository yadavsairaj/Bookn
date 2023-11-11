package com.Healthcare.BookingApplication.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Healthcare.BookingApplication.Entity.Doctor;
import com.Healthcare.BookingApplication.Service.DoctorService;
import com.Healthcare.BookingApplication.Service.DoctorServiceImpl;


@RestController
@RequestMapping("/api")
public class DoctorController {
    @Autowired
    private DoctorServiceImpl doctorService;

    
    
    // @Autowired
    // public DoctorController(DoctorService doctorService){
    //     this.doctorService=doctorService;
    // }
    @GetMapping("/doctor")
    public String abc(){
        return "'abc'";
    }

    @GetMapping("/doctors")
    public List<Doctor> findAllDoctors(){
        return doctorService.findAllDoctors();
       
    }

    @GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor> findDoctorById(@PathVariable Long id){
        Doctor doctor  = doctorService.findDoctorById(id);
        return ResponseEntity.ok(doctor);
	}

}
