package com.abhi.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.employeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
