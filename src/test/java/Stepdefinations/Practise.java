package Stepdefinations;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basepackage.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practise {
	String url="https://rahulshettyacademy.com/seleniumPractise/#/";
	WebDriver driver;
	@Given("User is on greenkart website homepage")
	public void user_is_on_greenkart_website_homepage() throws IOException {
	   driver=baseclass.getdriver();
	   
	}

	@When("user enters vegetable name in the in search bar {string} and click on search button")
	public void user_enters_vegetable_name_in_the_in_search_bar_and_click_on_search_button(String string) {
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
	   driver.findElement(By.xpath("//h4[@class='product-name']")).getText().contains(string);
	}

	
	@Then("validate vegetable name after searching")
	public void validate_vegetable_name_after_searching() {
		
	  
	   System.out.println("validate the veg data");
	   
	}
	@Then("user increament the count and add prodcut to cart")
	public void user_increament_the_count_and_add_prodcut_to_cart() throws InterruptedException {
		Thread.sleep(300);
		 driver.findElement(By.xpath("//input[@class='quantity']/following-sibling::a")).click();
		 
		 Thread.sleep(100);
		 driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}

	


}
