package net.webapp.ems.mapper;

import net.webapp.ems.dto.EmployeeDto;
import net.webapp.ems.entity.Employee;

public class EmployeeMapper {

    //maps employee JPA Entity to employeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
