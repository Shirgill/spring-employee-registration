package com.company.employee.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.employee.crud.entity.Employee;
import com.company.employee.crud.repository.EmployeeCrudDAO;
import com.company.employee.dto.EmployeeDetailsDTO;

@Service
public class EmployeeCrudServiceImpl implements EmployeeCrudService {

	@Autowired
	private EmployeeCrudDAO employeeCrudDAO;

	@Override
	public long saveEmployeeData(EmployeeDetailsDTO employee) {
		return employeeCrudDAO.saveEmployee(employee);
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetailsDTO employeeDetails) {
		return employeeCrudDAO.updateEmployeeDetails(employeeDetails);
	}

	@Override
	public Employee getEmployeeDetails(long employeeid) {
		return employeeCrudDAO.getEmployeeDetails(employeeid);
	}

	@Override
	public boolean deleteEmployeeRecord(long employeeid) {
		return employeeCrudDAO.deleteEmployee(employeeid);
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeCrudDAO.getAllEmployees();
	}
}
