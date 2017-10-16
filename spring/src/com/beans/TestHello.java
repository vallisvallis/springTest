package com.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	private BeanFactory factory;
	
	
	@Test
	public void test(){
		Computer computer=(Computer) factory.getBean("computer");
		computer.show();
	}
	
	@Before
	public void setUp(){
	factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	@After
	public void turnDown(){
		factory=null;
		
	}
}
