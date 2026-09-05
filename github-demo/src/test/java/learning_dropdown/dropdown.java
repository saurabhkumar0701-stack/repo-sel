package learning_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
		/*//1)create webelement reference for dd element
		WebElement ssdd=driver.findElement(By.id("single-select"));
		
		//2)create object of select class
		Select selsingle=new Select(ssdd);
		
		//3) perform the task
		/// 
		selsingle.selectByIndex(1);
		Thread.sleep(1000);
		selsingle.selectByValue("ca");
		Thread.sleep(1000);
		selsingle.selectByVisibleText("India");
		Thread.sleep(3000);
		//selsingle.deselectByVisibleText("India");//  java.lang.UnsupportedOperationException
		
		List<WebElement> options =selsingle.getOptions();
		for(WebElement i:options) {
			System.out.println(i.getText());
			Thread.sleep(2000);
		}
		
		boolean statuscountry=selsingle.isMultiple();
		if(statuscountry) {
			selsingle.deselectAll();
		}*/
		
		// multiselect dropdown
		//1) create webelement reference for multi dd
		WebElement msdd=driver.findElement(By.id("multi-select"));
		
		// 2) create object of select class
		Select selmultiple=new Select(msdd);
		
		//3) perform the task
		selmultiple.selectByIndex(3);
		Thread.sleep(2000);
		selmultiple.selectByValue("java");
		Thread.sleep(2000);
		selmultiple.selectByVisibleText("Maven");
		Thread.sleep(2000);
		//if(selmultiple.isMultiple()) {
			//selmultiple.deselectAll();
		//}
		
		// get first selected option
		WebElement firstselected=selmultiple.getFirstSelectedOption();
		System.out.println(firstselected.getText());
		
		// get all selected options
	List<WebElement> allselected=selmultiple.getAllSelectedOptions();
	for(WebElement i:allselected) {
		System.out.println(i.getText());
	}
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();




	}

}
