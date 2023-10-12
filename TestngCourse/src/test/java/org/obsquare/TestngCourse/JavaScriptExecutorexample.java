package org.obsquare.TestngCourse;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorexample extends Base {
	@Test
	public void executorExample() {

		JavaScriptExecutorexample executoralert = (JavaScriptExecutorexample) driver;
		String input = "hello";
		WebElement Entermessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//executoralert.executeScript("arguments[0].value='happymorning'", Entermessage);
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		//executoralert.executeScript("arguments[0].click();", showmessagebutton);
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText = yourmessage.getText();
		String expectedMessage = "Your Message : " + input;
		assertEquals(expectedMessage, yourmessageText, "The expected message is" + expectedMessage + "not available");
	}

	@Test
	public void scroll() {
		JavaScriptExecutorexample executoralert = (JavaScriptExecutorexample) driver;
		//executoralert.executeScript("window.scrollBy(0,100)", null);

	}
}
