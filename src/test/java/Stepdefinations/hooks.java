package Stepdefinations;

import basepackage.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends baseclass{
	@Before("@kart")
	public void before()
	{
		System.out.println("beforeweb");
	}
	@After()
	public void after()
	{
		driver.close();
	}
	

}
