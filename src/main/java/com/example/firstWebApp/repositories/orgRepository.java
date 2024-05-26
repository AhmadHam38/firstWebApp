package com.example.firstWebApp.repositories;

import com.example.firstWebApp.enteties.org;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


    public interface orgRepository extends JpaRepository<org,Long> {

        @Query("SELECT o FROM org o WHERE o.orgID= :orgID")
        public org findOrgByID(long org);
    }

