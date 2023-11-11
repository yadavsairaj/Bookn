package com.Healthcare.BookingApplication.Service;

import java.util.List;


import com.Healthcare.BookingApplication.Entity.Patient;

public interface PatientService {
    Patient createPatient(Patient patient);
    List<Patient> findAllPatients();
    Patient findPatientById(Long id);
    Patient updatePatient(Long id, Patient patientDetails);
    void deletePatient(Long id);
    Patient savePatient(Patient patient);
    
}
