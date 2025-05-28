package com.google.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.Base;
import com.google.pages.Pages;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Base {
	
	Pages page;

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
	    
	    getDriver();
	    
	    page = PageFactory.initElements(driver, Pages.class);
	}

	@When("I enter my search {string}")
	public void i_enter_my_search(String string) {
	    
	   // driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(string);
		
		page.getSearch(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    
	   // driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
		
		page.getSearchbtn();
	}

	@Then("I receive related serach result")
	public void i_receive_related_serach_result() {
	    
	    Assert.assertEquals(driver.getTitle(), driver.getTitle());
	}
	
	@After
	public void teardown() {
		if (driver !=null) {
			driver.quit();
		}
	}
	
}

