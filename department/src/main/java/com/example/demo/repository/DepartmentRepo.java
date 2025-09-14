package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}