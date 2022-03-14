package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\day4 task2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btnOver = driver.findElement(By.xpath("//span[@title='Overview']"));
		
		btnOver.click();
		
		Thread.sleep(3000);
		
		
		WebElement txtpara = driver.findElement(By.xpath("//pp[contains(text(),'Greens Technologies')]"));
		txtpara.click();
		
		String output = txtpara.getText();
		
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
