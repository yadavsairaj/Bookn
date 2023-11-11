package com.Healthcare.BookingApplication.Entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "my_entity_seq_gen")
    private Long id;

    private String name;
    private String specialization;

    @OneToMany(mappedBy = "doctor")
    private Set<Appointment> appointments;

    public Doctor(Long id, String name, String specialization, Set<Appointment> appointments) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.appointments = appointments;
    }
    public Doctor(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }
    @Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", appointments="
                + appointments + "]";
    }
    
}
