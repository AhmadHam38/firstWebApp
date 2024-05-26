package com.example.firstWebApp.repositories;


import com.example.firstWebApp.enteties.volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface volunteerRepository extends JpaRepository<volunteer,Long> {
    volunteer findVolunteerByID(long volunteerID);

  //   @Query("SELECT v FROM volunteer v WHERE v.volunteerID = :ID")
 //   public volunteer findVolunteerByID(long volunteerID);
}
