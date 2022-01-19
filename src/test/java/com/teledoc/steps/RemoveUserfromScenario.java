package com.teledoc.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.teledoc.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RemoveUserfromScenario extends CommonMethods {

	
	@Given("user able to delete username")
	public void user_able_to_delete_username() {
	   
		int row = userTable.row.size();
		int col = userTable.col.size();
		
		for(int i=1; i < row; i++) {
			
			
			for(int j=1; j < col; j++) 
			{
				
				WebElement customXpath = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				String cellData = customXpath.getText();
				
				if(cellData.equals("novak")) {	
					
					click(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+11+"]/button/i")));
					
					wait(1);
					
					click(driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")));
				
				}
				
			}
			
			
		}
		
		
	}

	@Then("user validates user removed {string}")
	public void user_validates_user_removed(String userNovak) {
	    
		for(WebElement el : userTable.userList) {
			
			boolean con = el.getText().contains(userNovak);
			
			
			if(con == false) {
				
				Assert.assertFalse(con);
			
				
			}
			else {
				Assert.assertTrue(con);
			}
		
		
			
			}
		
		
	}



	
	
}
