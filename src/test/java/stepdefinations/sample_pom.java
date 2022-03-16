package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sample_pom {
	
	 WebDriver driver;

	public sample_pom(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By textbox = By.xpath("//*[@jsaction='paste:puy29d;']");
	
	By search = By.xpath("//*[@class='FPdoLc lJ9FBc']/center/input[1]");
	
	
	public void textbox(String arg1) {
		
		driver.findElement(textbox).sendKeys(arg1);
		
	}
	public void search() {
		
		driver.findElement(search).click();
	}
}
