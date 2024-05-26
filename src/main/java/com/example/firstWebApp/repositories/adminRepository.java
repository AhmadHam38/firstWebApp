package com.example.firstWebApp.repositories;

import com.example.firstWebApp.enteties.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


    public interface adminRepository extends JpaRepository<admin,Long> {

        @Query("SELECT a FROM admin a WHERE a.adminID = :adminID")
        public admin findAdminByID(long adminID);
    }



