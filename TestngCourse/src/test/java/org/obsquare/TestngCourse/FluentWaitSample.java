package org.obsquare.TestngCourse;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;


public class FluentWaitSample extends Base {
	@Test
	public void fluentwaitExample()
	{
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(showmessagebutton));
		showmessagebutton.click();
	}
	@Test

	public void fluentwaitElementstoBeSelected()
	{
	
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		clickonthischeckbox.click();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeSelected(clickonthischeckbox));
	
}
	@Test
	public void fluentWaitTitletobe()
	{
		driver.navigate().to("https://toolsqa.com/");
		WebElement tutorials=driver.findElement(By.xpath("//span[text()='Tutorials']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(20))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.titleContains("Tools QA"));
		tutorials.click();
		
	}
	@Test
	public void fluentWaitelementstobeClickable2()
	{
		driver.navigate().to("https://toolsqa.com/");
		WebElement homelink=driver.findElement(By.xpath("//li[text()='Home']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(60))
				  .pollingEvery(Duration.ofSeconds(10))
				  .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(homelink));
		homelink.click();
		
	}
}
