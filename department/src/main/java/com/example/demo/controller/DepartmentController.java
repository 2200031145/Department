package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Department;
import com.example.demo.response.DepartmentResponse;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<String> createDepartment(@RequestBody Department department) {
        Department dept = departmentService.createDepartment(department);
        return ResponseEntity.ok("Department with ID " + dept.getId() + " created successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponse> getDepartment(@PathVariable int id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
        return ResponseEntity.ok("Department with ID " + id + " deleted successfully");
    }
}
