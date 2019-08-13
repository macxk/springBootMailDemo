package com.kon.bootMailDemo;

import com.kon.bootMailDemo.sender.SimpleEmailSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootMailDemoApplicationTests {

	@Autowired
	private SimpleEmailSender simpleEmailSender;

	@Test
	public void contextLoads() {
	}

}
