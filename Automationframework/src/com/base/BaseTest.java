package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Excelutil;
import com.util.Locators;
import com.util.configuration;
import com.util.pageDriver;

public abstract class BaseTest {
	public pageDriver driver;
	public Excelutil excelutil;
	public static final configuration config;
	static{
		config = new configuration();
	}

  @BeforeSuite
public void beforeSuite(){
	this.driver= new pageDriver(config);
	Locators.readlocators();
	excelutil = new Excelutil();
	
}
  @AfterSuite
public void afterSuite(){
	driver.quit();
	
}
}