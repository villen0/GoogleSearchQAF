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
	

	
	@FindBy(xpath= "//textarea[@class='gLFyf']") WebElement search;
	
	@FindBy(xpath="(//input[@class='gNO89b'])[1]") WebElement searchbtn;
	
	
	public void getSearch(String string) {
		
		search.sendKeys(string);
	}
	
	
	public void getSearchbtn() {
		
		searchbtn.click();
		
	}
}
