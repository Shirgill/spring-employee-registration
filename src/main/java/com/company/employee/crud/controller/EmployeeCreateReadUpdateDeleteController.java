package com.company.employee.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.employee.crud.entity.Employee;
import com.company.employee.crud.service.EmployeeCrudService;
import com.company.employee.dto.EmployeeDetailsDTO;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class EmployeeCreateReadUpdateDeleteController {
	
	@Autowired
	private EmployeeCrudService employeeCrudService;
 
    @RequestMapping("/employee/{employeeId}")
    public Employee getEmployeeDetails(@PathVariable String employeeId) {
		Employee employee = employeeCrudService.getEmployeeDetails(Long.valueOf(employeeId));
		return employee;
    }
 
    @PostMapping(value = "/addEmployee")
	public long createEmployee(@RequestBody Employee employee) {
    	EmployeeDetailsDTO employeeDetailDTO = new EmployeeDetailsDTO();
    	employeeDetailDTO.setName(employee.getName());
    	employeeDetailDTO.setAddress(employee.getAddress());
    	employeeDetailDTO.setDesignation(employee.getDesignation());
    	return employeeCrudService.saveEmployeeData(employeeDetailDTO);
	}
    
    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
    	return employeeCrudService.getAllEmployees();
    }
    
    @RequestMapping("/deleteEmployee/{employeeId}")
    public boolean deleteEmployee(@PathVariable String employeeId) {
    	return employeeCrudService.deleteEmployeeRecord(Long.valueOf(employeeId));
    }
    
    @PostMapping(value = "/updateEmployee")
	public boolean updateEmployee(@RequestBody EmployeeDetailsDTO employee) {
    	return employeeCrudService.updateEmployeeDetails(employee);
	}
    
}
