package com.example.firstWebApp.controlers;

import com.example.firstWebApp.enteties.volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class volunteerController {

        @Autowired
        private com.example.firstWebApp.services.volunteerService volunteerService;


    @PostMapping("/volunteer/addVolunteer")
        public @ResponseBody volunteer addVolunteer(@RequestBody volunteer v) {
            return volunteerService.addVolunteer(v);
        }

        @GetMapping("/volunteer/findVolunteerByID/{volunteerID}")
        public @ResponseBody volunteer findVolunteerByID( @PathVariable("volunteerID") long volunteerID) {
            return volunteerService.findVolunteerByID(volunteerID);
        }
    }





