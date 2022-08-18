package com.techno.employee.management.system.service;

import com.techno.employee.management.system.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
}
