package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorTest {
	
	@Test
    public void addTest()
    {
		CalculatorService cal=new CalculatorService();
        assertEquals(50, cal.sum(20, 30));
        Assertions.assertNotEquals(50, cal.sum(30, 30));
    }

   

    
}