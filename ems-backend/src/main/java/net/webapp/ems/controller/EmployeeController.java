package net.webapp.ems.controller;

import lombok.AllArgsConstructor;
import net.webapp.ems.dto.EmployeeDto;
import net.webapp.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    // This class will handle HTTP requests related to Employee operations
    // You can define methods here to handle CRUD operations, e.g., create, read, update, delete employees

    // Example method to create an employee (to be implemented)
    // @PostMapping
    // public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
    //     EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);
    //     return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    // }

    private EmployeeService employeeService;

    // Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
