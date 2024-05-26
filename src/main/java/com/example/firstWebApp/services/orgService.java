package com.example.firstWebApp.services;

import com.example.firstWebApp.enteties.org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orgService {






        @Autowired
        private com.example.firstWebApp.repositories.orgRepository orgRepository;

        public org addOrg(org o)
        {
            return  orgRepository.save(o);
        }



    public org findOrgByID (long orgID)
        {
            return this.orgRepository.findOrgByID(orgID);
        }



}
