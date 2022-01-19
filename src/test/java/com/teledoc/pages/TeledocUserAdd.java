package com.teledoc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teledoc.utils.CommonMethods;

public class TeledocUserAdd extends CommonMethods{
	
	//I stored add section of website
	
	@FindBy(xpath="//h3[@class='ng-binding']")
	public WebElement message;
	
	@FindBy(xpath="//input[@name='FirstName']")
	public WebElement name;

	@FindBy(xpath="//input[@name='LastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='UserName']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='Password']")
	public WebElement password;
	
	@FindBy(xpath="//label[1][@class='radio ng-scope ng-binding']")
	public WebElement companyA;
	
	@FindBy(xpath="//label[2][@class='radio ng-scope ng-binding']")
	public WebElement companyB;
	
	@FindBy(xpath="//select[@name='RoleId']")
	public WebElement role;
	
	@FindBy(xpath="//input[@name='Email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='Mobilephone']")
	public WebElement mobile;
	

	@FindBy(xpath="//button[@class='btn btn-success']")
	public WebElement save;
	
	public TeledocUserAdd() {
		PageFactory.initElements(driver, this);
	}

}


