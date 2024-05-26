package com.example.firstWebApp.controlers;

import com.example.firstWebApp.enteties.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class adminController {


        @Autowired
        private com.example.firstWebApp.services.adminService adminService;

        @PostMapping("/admin/addAdmin")
        public @ResponseBody admin addAdmin(@RequestBody admin a) {
            return adminService.addAdmin(a);
        }

       @GetMapping("/admin/findAdminByID/{adminID}")
       public @ResponseBody admin findAdminByID (@PathVariable("adminID") long adminID) {
            return adminService.findAdminByID(adminID);
      }
    }

