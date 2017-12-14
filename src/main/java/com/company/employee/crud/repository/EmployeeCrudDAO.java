package com.company.employee.crud.repository;

import java.util.List;

import com.company.employee.crud.entity.Employee;
import com.company.employee.dto.EmployeeDetailsDTO;

/**
 * This is a database interface for CRUD opeartions on Employee entity in the system.
 * 
 * @author farhan.shirgill@gmail.com
 * @version 1.0
 * @since 13/12/2017
 */
public interface EmployeeCrudDAO {
	
	/**
	 * This method will be used to save/create the new employee data in the system.
	 */
	public long saveEmployee(EmployeeDetailsDTO employeeDetails);

	
	/**
	 * This method will be used to update the new employee data in the system.
	 */
	public boolean updateEmployeeDetails(EmployeeDetailsDTO employeeDetails);

	
	/**
	 * This method will be used to fetch the new employee details from the db system.
	 */
	public Employee getEmployeeDetails(long employeeid);

	
	/**
	 * This method will be used to delete the employee record in the system.
	 */
	public boolean deleteEmployee(long employeeid);
	
	/**
	 * This method will be used to get all the employees record in the organisation.
	 */
	public List<Employee> getAllEmployees();

}
