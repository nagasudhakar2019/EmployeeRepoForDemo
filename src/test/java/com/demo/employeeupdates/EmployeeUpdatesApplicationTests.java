package com.demo.employeeupdates;
//imports
import com.demo.employeeupdates.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@ActiveProfiles("test")
@SpringBootTest(classes = {EmployeeUpdatesApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeUpdatesApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EmployeeService employeeService;

	@BeforeAll
	public void setUp(){
		//create a table
		jdbcTemplate.execute("create table Employee (Id int, Name varchar)");
		System.out.println("Table has been created");
	}


	@Test
	public void test1CreateEmployee(){
		Assertions.assertEquals("Employee has been created", employeeService.insertEmployee("001","test","test"));
	}

	@Test
	public void test2IfEmployeeExists(){
		Assertions.assertEquals("EXIST", employeeService.checkEmployeeExists("001"));
	}

	@Test
		public void test3IfEmployeeNotExists(){
		Assertions.assertEquals("NOT-EXIST", employeeService.checkEmployeeExists("002"));
	}

	@Test
	public void test4deleteEmployee(){
		Assertions.assertEquals("Employee has been deleted", employeeService.deleteEmployee("001"));
	}

	@Test
	public void test5IfEmployeeDeleted(){
		Assertions.assertEquals("NOT-EXIST", employeeService.checkEmployeeExists("001"));
	}
}
