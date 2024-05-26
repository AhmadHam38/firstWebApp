package com.example.firstWebApp.services;

import com.example.firstWebApp.enteties.volunteer;
import com.example.firstWebApp.repositories.volunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class volunteerService {
        @Autowired
        private volunteerRepository volunteerRepository;

        public volunteer addVolunteer(volunteer v)
        {
            return  volunteerRepository.save(v);
        }

        public volunteer findVolunteerByID(long volunteerID)
        {
            return this.volunteerRepository.findVolunteerByID(volunteerID);
        }
    }


