package com;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest {
	 @Test
	    public void testSayHello()
	    {
	        MessageService ms = new MessageService();
	        assertEquals("Hello!", ms.sayHello());
	      
	    }

	   

}
