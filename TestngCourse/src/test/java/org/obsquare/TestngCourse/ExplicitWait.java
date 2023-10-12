package org.obsquare.TestngCourse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait extends Base{
	@Test
	public void explicitwaitExample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//label[@for='gridCheck']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(clickonthischeckbox));
		clickonthischeckbox.click();
		boolean ischeckboxbuttonselected = clickonthischeckbox.isSelected();
		
		WebElement clickMe2 = driver.findElement(By.xpath("//button[contains(@class,'btn-warning')]"));
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.elementToBeClickable(clickMe2));
		clickMe2.click();
		
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement draggablen1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement droppableBox = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait3.until(ExpectedConditions.elementToBeSelected(draggablen1));
		actions.moveToElement(draggablen1).click().perform();
		actions.doubleClick(draggablen1).perform();
		actions.contextClick().perform(); //right click
		actions.clickAndHold().perform();
		
		WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait4.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(droppableBox));
		actions.dragAndDrop(draggablen1, droppableBox);
	}

}
