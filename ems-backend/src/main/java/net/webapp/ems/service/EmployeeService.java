package net.webapp.ems.service;

import net.webapp.ems.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeByID(Long employeeId);
}

