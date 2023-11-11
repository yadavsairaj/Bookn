package com.Healthcare.BookingApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Healthcare.BookingApplication.Entity.Appointment;
import com.Healthcare.BookingApplication.Exception.UserNotFoundException;
import com.Healthcare.BookingApplication.Repository.AppointmentRepository;


@Service
public class AppointmentServiceImpl implements AppointmentService {

    
    private AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository){
        this.appointmentRepository=appointmentRepository;
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment findAppointmentById(Long id) {
                return appointmentRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Appointment not found with id: "+ id));

    }


    @Override
    public Appointment updateAppointmentById(Appointment appointmentDetails,  Long id) {
        Appointment appointment = findAppointmentById(id);
       appointment.setAppointmenTime(appointmentDetails.getAppointmenTime());
       appointment.setReason(appointmentDetails.getReason());
       return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        Appointment appointment = findAppointmentById(id);
        appointmentRepository.delete(appointment);
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
    
}
