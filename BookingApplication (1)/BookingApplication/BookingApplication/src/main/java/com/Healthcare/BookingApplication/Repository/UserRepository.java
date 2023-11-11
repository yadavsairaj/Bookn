package com.Healthcare.BookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Healthcare.BookingApplication.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
