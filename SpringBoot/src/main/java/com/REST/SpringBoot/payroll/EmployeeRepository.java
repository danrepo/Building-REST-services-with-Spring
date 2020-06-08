package com.REST.SpringBoot.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

interface EmployeeRepository extends JpaRepository<Employee, Long> {


}