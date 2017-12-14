package com.company.employee.crud.repository.test;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



import com.company.employee.crud.repository.EmployeeCrudDAO;
import com.company.employee.dto.EmployeeDetailsDTO;


@WebAppConfiguration
@ContextConfiguration({ "classpath:dao-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages = {"com.company"})
public class EmployeeCrudOperationsTest {
	
	/** The entity manager. */
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private EmployeeCrudDAO employeeCrudDAOImpl;
	
	@Before
	public void setupInitialiser(){
		// ...
	}
	
	@After
	public void tearDown(){
		// ...
	}
	
	@Test
	public void testSaveEmployeeDetails() {
		
		EmployeeDetailsDTO employee = new EmployeeDetailsDTO();
		employee.setName("Test User");
		employee.setAddress("Riyadh SA");
		employee.setDesignation("Unknown");
		
		Assert.assertEquals(true, employeeCrudDAOImpl.saveEmployee(employee));
		
	}
	
	@Test
	public void testUpdateEmployeeDetails() {
		
		EmployeeDetailsDTO employee = new EmployeeDetailsDTO();
		employee.setId(12);
		employee.setName("Update Name");
		employee.setAddress("Unknown Address");
		employee.setDesignation("Unknown Designation");
		Assert.assertEquals(true, employeeCrudDAOImpl.updateEmployeeDetails(employee));
		
	}
	
	@Test
	public void testGetEmployeeDetails() {
		Assert.assertEquals("Test User", employeeCrudDAOImpl.getEmployeeDetails(13).getName());
	}
	
	@Test
	public void testDeleteEmployeeRecord() {
		Assert.assertEquals(true, employeeCrudDAOImpl.deleteEmployee(15));
	}
	
	@Test
	public void testGetAllEmployees() {
		Assert.assertEquals(12, employeeCrudDAOImpl.getAllEmployees().size());
		System.out.println("");
	}
	
	
}
