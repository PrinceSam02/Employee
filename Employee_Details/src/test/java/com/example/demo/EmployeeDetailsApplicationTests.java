package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDetailsApplicationTests {

	@Test
	void contextLoads() {
		assertNotNull( "The value should not be null");
	}

}
