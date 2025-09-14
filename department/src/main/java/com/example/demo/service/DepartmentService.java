package com.example.demo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Department;
import com.example.demo.repository.DepartmentRepo;
import com.example.demo.response.DepartmentResponse;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private ModelMapper mapper;

    public DepartmentResponse getDepartmentById(int id) {
        Department department = departmentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
        return mapper.map(department, DepartmentResponse.class);
    }


    public Department createDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public void deleteDepartment(int id) {
        departmentRepo.deleteById(id);
    }
}
