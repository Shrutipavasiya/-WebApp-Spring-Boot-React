package net.webapp.ems.service;

import net.webapp.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeByID(Long employeeId);
    List<EmployeeDto> getAllEmployees();
}

