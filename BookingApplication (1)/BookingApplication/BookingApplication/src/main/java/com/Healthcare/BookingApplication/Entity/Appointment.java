package com.Healthcare.BookingApplication.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

    private LocalDateTime appointmenTime;
    private String reason;


    
    public Appointment(Long id, Doctor doctor, Patient patient, LocalDateTime appointmenTime, String reason) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.appointmenTime = appointmenTime;
        this.reason = reason;
    }
    public Appointment(){}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public LocalDateTime getAppointmenTime() {
        return appointmenTime;
    }
    public void setAppointmenTime(LocalDateTime appointmenTime) {
        this.appointmenTime = appointmenTime;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    @Override
    public String toString() {
        return "Appointment [id=" + id + ", doctor=" + doctor + ", patient=" + patient + ", appointmenTime="
                + appointmenTime + ", reason=" + reason + "]";
    }

    
}
