package com.project.hrleave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hrleave.entity.Leaveentity;
import com.project.hrleave.repository.Leaverepository;

@Service
public class LeaveService {
   @Autowired
    public List<Leaveentity> fetchLeavedetails() {
        // TODO Auto-generated method stub
        Leaverepository repo;
        
        throw new UnsupportedOperationException("Unimplemented method 'fetchLeavedetails'");
    }
    
}
