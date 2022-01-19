package com.teledoc.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teledoc.utils.CommonMethods;

public class TeledocUserTable extends CommonMethods  {
	
	//I stored table elements from the website 
	
	@FindBy(xpath="//table/thead/tr[2]/td/button")
	public WebElement addUser;
	
	@FindBy(xpath="//table/tbody/tr/td")
	public List<WebElement> value;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td[11]/button/i")
	public WebElement delete;
	
	
	@FindBy(xpath="//div[@class='modal-footer']/button[2]")
	public WebElement ok;
	
	@FindBy(xpath="//table/tbody/tr/td[3]")
	public List<WebElement> userList;
	
	@FindBy(xpath="/html/body/table/tbody/tr[3]/td[11]/button/i")
	public WebElement novak;
	
	//Below for customXpath
	@FindBy(xpath="//table/tbody/tr")
	public List<WebElement> row;
	
	@FindBy(xpath="//table/tbody/tr[1]/td")
	public List<WebElement> col;
	
	
	public TeledocUserTable() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	

}
