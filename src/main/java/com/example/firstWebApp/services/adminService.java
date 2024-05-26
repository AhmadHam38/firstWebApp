package com.example.firstWebApp.services;

import com.example.firstWebApp.enteties.admin;
import com.example.firstWebApp.repositories.adminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class adminService {

        @Autowired
        private adminRepository adminRepository;

        public admin addAdmin(admin a)
        {
            return  adminRepository.save(a);
        }

        public admin  findAdminByID (long adminID)
        {
            return this.adminRepository.findAdminByID(adminID);
        }
    }

