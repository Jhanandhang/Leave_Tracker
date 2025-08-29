package com.project.hrleave.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "users")
@Data
public class Leaveentity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Added this
    private int user_id;

    @Column(name = "name",nullable = false,unique = true)
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password; 
}
