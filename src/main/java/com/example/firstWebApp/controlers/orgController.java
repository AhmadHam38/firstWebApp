package com.example.firstWebApp.controlers;

import com.example.firstWebApp.enteties.org;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class orgController {




        @Autowired
        private com.example.firstWebApp.services.orgService orgService;

        @PostMapping("/org/addOrg")
        public @ResponseBody org addOrg(@RequestBody org o) {
            return orgService.addOrg(o);
        }

       @GetMapping("/org/findOrgByID/{orgID}")
        public @ResponseBody org findOrgByID(@PathVariable( "orgID") long OrgID) {
           return orgService.findOrgByID(OrgID);
        }
    }



