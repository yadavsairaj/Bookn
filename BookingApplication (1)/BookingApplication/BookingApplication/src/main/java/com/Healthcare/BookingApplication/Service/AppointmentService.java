package com.Healthcare.BookingApplication.Service;

import java.util.List;

import com.Healthcare.BookingApplication.Entity.Appointment;




public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);
    List<Appointment> findAllAppointments();
    Appointment findAppointmentById(Long id);
    Appointment updateAppointmentById(Appointment appointmentDetails, Long id);
    void deleteAppointment(Long id);
    Appointment saveAppointment(Appointment appointment);
    
}
