package com.base;

import com.util.pageDriver;

public abstract class BasePage {
	public pageDriver driver;
	public BasePage(pageDriver driver){
		this.driver=driver;
	}

}
