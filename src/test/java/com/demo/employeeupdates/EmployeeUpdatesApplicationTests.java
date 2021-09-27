package com.demo.employeeupdates;

import com.demo.employeeupdates.service.EmployeeService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.powermock.api.mockito.PowerMockito;
@DataJpaTest
class EmployeeUpdatesApplicationTests {
	@InjectMocks
	private EmployeeService employeeService;
	@Mock
	private JdbcTemplate jdbcTemplate;
	@Test
	public void testCreateEmployee(){
//		PowerMockito.when(jdbcTemplate.update(Mockito.any(),Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(1);
//		String result = employeeService.insertEmployee("123","test","test");
//		Assert.assertEquals("record has been created",result);
	}
}
