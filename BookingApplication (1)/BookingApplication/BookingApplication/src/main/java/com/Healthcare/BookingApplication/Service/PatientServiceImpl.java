package com.Healthcare.BookingApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Healthcare.BookingApplication.Entity.Patient;
import com.Healthcare.BookingApplication.Exception.UserNotFoundException;
import com.Healthcare.BookingApplication.Repository.PatientRepository;


import jakarta.transaction.Transactional;

@Service
public class PatientServiceImpl implements PatientService {

    
    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    @Override
    @Transactional
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Patient not found with id: "+ id));
    }

    @Override
    public Patient updatePatient(Long id, Patient patientDetails) {
       Patient patient = findPatientById(id);
       patient.setName(patientDetails.getName());
       patient.setEmail(patientDetails.getEmail());
       return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        Patient patient = findPatientById(id);
        patientRepository.delete(patient);
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }
    
}
