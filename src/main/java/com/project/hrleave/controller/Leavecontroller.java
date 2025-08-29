package com.project.hrleave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hrleave.entity.Leaveentity;
import com.project.hrleave.service.LeaveService;

@RestController
public class Leavecontroller {
    @Autowired
    LeaveService service;
    @GetMapping("/fetchdata")
    public List<Leaveentity>fetchLeaveentities(){
        return service.fetchLeavedetails();
    }
}
