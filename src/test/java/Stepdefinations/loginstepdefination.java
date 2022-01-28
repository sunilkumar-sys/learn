package Stepdefinations;



import java.util.List;

import org.openqa.selenium.By;

import basepackage.baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginstepdefination extends baseclass{
	
	 @Given("^User is on the login page of the website$")
	    public void user_is_on_the_login_page_of_the_website() throws Throwable {
	        System.out.println("1");
	    }

	 @When("user enters {string} and {string} in the respective fields")
	 public void user_enters_and_in_the_respective_fields(String string, String string2) {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println(string);
		 System.out.println(string2);
	    
	 }

	    @Then("^user click on login button$")
	    public void user_click_on_login_button() throws Throwable {
	    	System.out.println("3");
	    }

	    @And("^user should be landed on home page of the website$")
	    public void user_should_be_landed_on_home_page_of_the_website() throws Throwable {
	    	System.out.println("4");
	    }
	    @When("user singup with following details")
	    public void user_singup_with_following_details(io.cucumber.datatable.DataTable dataTable) {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	     List<List<String>> data= dataTable.asLists();
	   
	     System.out.println(data.get(0).get(0));
	     System.out.println(data.get(0).get(1));
	     System.out.println(data.get(0).get(2));
	     System.out.println(data.get(0).get(3));
	    }

	    @When("^user enter (.+) and (.+) in the respective fields$")
	    public void user_enter_and_in_the_respective_fields(String username, String password) throws Throwable {
	      System.out.println(username);
	      System.out.println(password);
	    }
	    @Then("click on cart button and click on payment checkout option")
		public void click_on_cart_button_and_click_on_payment_checkout_option() throws InterruptedException {
			Thread.sleep(100);
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			Thread.sleep(100);
			   driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		}

}
