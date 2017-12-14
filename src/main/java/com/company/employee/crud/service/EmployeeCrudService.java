package com.company.employee.crud.service;

import java.util.List;

import com.company.employee.crud.entity.Employee;
import com.company.employee.dto.EmployeeDetailsDTO;

/**
 * This is a service to perform concrete business logic to further handle the
 * task CRUD to the dao layer in the system.
 * 
 * @author farhan.shirgill@gmail.com
 * @version 1.0
 * @since 13/12/2017
 */
public interface EmployeeCrudService {

	/**
	 * This method will be used to perform business logic to further handle
	 * Create task to the dao layer in the system.
	 */
	public long saveEmployeeData(EmployeeDetailsDTO employee);

	/**
	 * This method will be used to perform business logic to further handle
	 * Update task to the dao layer in the system.
	 */
	public boolean updateEmployeeDetails(EmployeeDetailsDTO employeeDetails);

	/**
	 * This method will be used to perform business logic to further handle Read
	 * task to the dao layer in the system.
	 */
	public Employee getEmployeeDetails(long employeeid);

	/**
	 * This method will be used to perform business logic to further handle
	 * Delete task to the dao layer in the system.
	 */
	public boolean deleteEmployeeRecord(long employeeid);
	
	/**
	 * This method will be used to get all the employees in the organisation.
	 */
	public List<Employee> getAllEmployees();

}
