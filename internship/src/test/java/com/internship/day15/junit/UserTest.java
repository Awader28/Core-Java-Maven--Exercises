package com.internship.day15.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

	@Test
	public void checks() {
		Age age = new Age();

        // Simulating user input for the name and age
        User u = new User();
        u.setName("atharva");
        u.setAge(16);
        
        assertEquals("atharva",u.getName());
        assertEquals(15, u.getAge());
	}
}
