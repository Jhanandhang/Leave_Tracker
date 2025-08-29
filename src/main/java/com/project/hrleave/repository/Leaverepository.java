package com.project.hrleave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hrleave.entity.Leaveentity;

@Repository
public interface Leaverepository extends JpaRepository<Leaveentity,Integer>
 {
}
