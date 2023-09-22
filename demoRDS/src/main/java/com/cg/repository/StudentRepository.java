package com.cg.repository;

import org.springframework.stereotype.Repository;

import com.cg.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {
}


