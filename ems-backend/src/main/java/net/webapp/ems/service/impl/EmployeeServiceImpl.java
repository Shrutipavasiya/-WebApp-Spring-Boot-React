package net.webapp.ems.service.impl;

import lombok.AllArgsConstructor;
import net.webapp.ems.dto.EmployeeDto;
import net.webapp.ems.entity.Employee;
import net.webapp.ems.mapper.EmployeeMapper;
import net.webapp.ems.repository.EmployeeRepository;
import net.webapp.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
