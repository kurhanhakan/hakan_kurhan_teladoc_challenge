package com.teledoc.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.teledoc.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserfromScenario extends CommonMethods{

	@When("User able to click add button")
	public void user_able_to_click_add_button() {
		  click(userTable.addUser);
		   wait(2);
	}

	@When("User able provide {string}, {string}, {string}, {string}")
	public void user_able_provide(String name, String lastName, String userName, String password) {
		   
		   sendText(userAdd.name,name);
		   sendText(userAdd.lastName, lastName);
		   sendText(userAdd.userName,userName);
		   sendText(userAdd.password, password);
		   wait(2);
		   
	}

	@When("User able to pick company")
	public void user_able_to_pick_company() {
		
		click(userAdd.companyA);
		 wait(2);
		 
	}

	@When("User able to pick role")
	public void user_able_to_pick_role() {
		
		selectDropdown(userAdd.role, "Sales Team");
		 wait(2);
		 
	}

	@When("User able provide {string},{string}")
	public void user_able_provide(String email, String mobile) {
		
		sendText(userAdd.email,email);
	    sendText(userAdd.mobile,mobile);
	    wait(1);
	
	}

	@When("User able to click save")
	public void user_able_to_click_save() {
		
		click(userAdd.save);
		  
	    wait(1);
	    
	}

	@Then("User able to validate {string}")
	public void user_able_to_validate(String userName) {
	   
		for(WebElement el : userTable.value) {
			
			boolean con = el.getText().equalsIgnoreCase(userName);

			if(con == true) {

				Assert.assertTrue(con);
				

				}
			
			}
		
		
	}
	
	
	
}
