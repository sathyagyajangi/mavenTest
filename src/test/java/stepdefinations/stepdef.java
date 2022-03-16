package stepdefinations;


import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef 
{
	
	
	WebDriver driver;
	
	@Before	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("open chrome browser")
	public void open_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
		
	}

	@When("open google and enter {string}")
	public void open_google_and_enter(String data) {
	    // Write code here that turns the phrase above into concrete actions
		
		sample_pom pom = new sample_pom(driver);
		pom.textbox(data);
	}


	@When("click search button")
	public void click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		 

		sample_pom pom = new sample_pom(driver);
		pom.search();
	    
	}

	@Then("data must populate")
	public void data_must_populate() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("data populated");
	}

	@After
	public void teardown()
	{
		
		driver.close();
	}
  
}
