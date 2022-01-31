package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {

	public WebDriver driver;
	
	public Pages(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@class='gLFyf gsfi']")
	WebElement search;
	
	public void getSearch(String string) {
		
		search.sendKeys(string);
	}
	
	@FindBy(xpath="(//input[@class='gNO89b'])[1]")
	WebElement searchbtn;
	
	public void getSearchbtn() {
		
		searchbtn.click();
		
	}
}
