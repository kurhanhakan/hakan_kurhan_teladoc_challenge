package com.teledoc.testbases;

import com.teledoc.pages.TeledocUserAdd;
import com.teledoc.pages.TeledocUserTable;

public class PageInitializer extends BaseClass {

	
	public static TeledocUserAdd userAdd;
	public static TeledocUserTable userTable;
	
	
	
	
	public static void initialize() {
	
		userAdd = new TeledocUserAdd();
		userTable = new TeledocUserTable();
		
	}

	
}
