package com.company.employee.crud.repository;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.company.employee.crud.entity.Employee;
import com.company.employee.dto.EmployeeDetailsDTO;

@Repository
public class EmployeeCrudDAOImpl implements EmployeeCrudDAO{
	
	Logger logger = Logger.getLogger("com.company.employee.crud.EmployeeCrudDAO");
	
	/** The entity manager. */
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public long saveEmployee(EmployeeDetailsDTO employeeDetails){
		try {
			Employee employee = new Employee();
	    	employee.setName(employeeDetails.getName());
	    	employee.setAddress(employeeDetails.getAddress());
	    	employee.setDesignation(employeeDetails.getDesignation());
			entityManager.persist(employee);
			entityManager.flush();
			return employee.getId();
		} catch (Exception exception) {
			// ...
		}
		return 0;
	}
	
	@Override
	@Transactional
	public boolean updateEmployeeDetails(EmployeeDetailsDTO employeeDetails){
		try {
			
			Employee employee = entityManager.find(Employee.class, employeeDetails.getId());
			if ( null != employee ) {
				employee.setName(employeeDetails.getName());
		    	employee.setAddress(employeeDetails.getAddress());
		    	employee.setDesignation(employeeDetails.getDesignation());
				entityManager.merge(employee);
				return true;
			}
	    	
		} catch (Exception exception) {
			// ...
		}
		return false;
		
	}
	
	@Override
	@Transactional
	public Employee getEmployeeDetails(long employeeid){
		try {
			
			Employee employee = entityManager.find(Employee.class, employeeid);
			if ( null != employee ) {
				return employee;
			}
	    	
		} catch (Exception exception) {
			// ...
		}
		return null;
	}
	
	@Override
	@Transactional
	public boolean deleteEmployee(long employeeid){
		try {
			
			Employee employee = entityManager.find(Employee.class, employeeid);
			if ( null != employee ) {
				entityManager.remove(employee);
				return true; // employee deleted successfully from db
			}
	    	
		} catch (Exception exception) {
			// 
			return false;
		}
		return false;
	}
	
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		try {
			TypedQuery<Employee> query = entityManager.createQuery("Select employee from Employee employee", Employee.class);
			List<Employee> employees = query.getResultList();
			return employees;
		} catch (Exception exception) {
			// ...
		}
		return null;
	}


}
