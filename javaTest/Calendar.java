package javaTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("form-field-travel_from")).sendKeys("Chennai");
		driver.findElement(By.id("form-field-travel_to")).sendKeys("NewDelhi");
		
		WebElement weakDD = driver.findElement(By.id("form-field-travel_comp_date_between"));
		Select weak = new Select(weakDD);
		weak.selectByIndex(1);
		
		WebElement airLineDD = driver.findElement(By.id("form-field-travel_comp_airline"));
		Select airLine= new Select(airLineDD);
		airLine.selectByVisibleText("Air India");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		
		WebElement month=driver.findElement(By.xpath("//span[@class='flatpickr-next-month']"));
		for(int i=0;i<=5;i++) {
			month.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='5'])[1]")).click();
		Thread.sleep(3000);
		WebElement languageDD = driver.findElement(By.id("form-field-travel_comp_language"));
		Select language = new Select(languageDD);
		language.selectByVisibleText("Tamil");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button//span[text()='SEARCH']")).click();
		String result = driver.findElement(By.xpath("//div[contains(text(),'No Results Found')]")).getText();
		System.out.println("Matches: "+result);
		
		driver.close();
	}
	 
}
