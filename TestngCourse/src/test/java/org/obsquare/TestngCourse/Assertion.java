package org.obsquare.TestngCourse;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends Base{
	@Test
	public void verifySingleInputField() 
	{
		
		String input = "hello";
		WebElement Entermessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Entermessage.sendKeys(input);
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText = yourmessage.getText();
		String expectedMessage="Your Message : "+input;
		assertEquals(expectedMessage,yourmessageText,"The expected message is"+expectedMessage+"not available"); 
	}
	
	@Test
	public void assertIsSelected()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickonthischeckbox.click();
		boolean ischeckboxbuttonselected = clickonthischeckbox.isSelected();
		//assertTrue(condition,negativemessage)
		assertTrue(ischeckboxbuttonselected,"The checkbox is not selected");
	}
	@Test
	public void assertFalseSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//label[@for='gridCheck']"));
		clickonthischeckbox.click();
		boolean ischeckboxbuttonselectedbeforeclick = clickonthischeckbox.isSelected();
		assertFalse(ischeckboxbuttonselectedbeforeclick,"The single checkbox is selected before click");
		
	}
	@Test
	public void VerifyshowMessagebuttonisalignedbelowSingleInputField()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleinputbutton = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		int locationofshowmessagebutton=showmessagebutton.getLocation().getY();
		int locationofsingleinputbutton=singleinputbutton.getLocation().getY();
		boolean IsshowmessageButtonalignedbelowsingleinputfield=locationofshowmessagebutton>locationofsingleinputbutton;
		assertTrue(IsshowmessageButtonalignedbelowsingleinputfield,"The showmessagebutton is not aligned below single input field");
	}

	@Test
	public void verifythetextofgetTotalbutton()
	{
		String textofgettotalbutton="Get Total";
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement pathofgettotalbutton=driver.findElement(By.xpath("//button[text()='Get Total']"));
		String expectedtextofgettotalbutton=pathofgettotalbutton.getText();
		assertEquals(expectedtextofgettotalbutton,textofgettotalbutton,"The text of gettotalbutton is notequal");
		
	}
	
	
	@Test
	public void verifythetextofShowButtonsisnot() {
		String textofshowmessagebutton="Show Messages";
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement pathofshowmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String expectedtextofshowmessagebutton=pathofshowmessagebutton.getText();
		boolean compare=textofshowmessagebutton.equals(expectedtextofshowmessagebutton);
		assertFalse(compare,"The text showmessages is notequal to the text of show message button");
		}
	
	
	@Test
	public void verifythetextofShowButtonsis() {
		String textofshowmessagebutton="Show Messages";
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement pathofshowmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String expectedtextofshowmessagebutton=pathofshowmessagebutton.getText();
		boolean compare=textofshowmessagebutton.equals(expectedtextofshowmessagebutton);
		assertNotEquals(textofshowmessagebutton,expectedtextofshowmessagebutton,"The text of show messages  is equals to the text of showmessagebutton ");
		}
	@Test
	public void verifytheAssertionNull()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement pathofshowmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String expectedvalueofshowmessagebutton=pathofshowmessagebutton.getAttribute("data-form");
		assertNull(expectedvalueofshowmessagebutton,"The attribute value is not available for the Webelement selected");
	}
	@Test
	public void verifytheAssertionnotNull()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement pathofshowmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String expectedvalueofshowmessagebutton=pathofshowmessagebutton.getAttribute("id");
		assertNotNull(expectedvalueofshowmessagebutton,"The attribute value is available for the Webelement selected");
	}
	@Test
	public void SoftAssertionSample()
	{
		SoftAssert softassert=new SoftAssert();
		String color="red";
		WebElement showmessagebuttonfontcolor = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showmessagebuttonfontcolourClassname = showmessagebuttonfontcolor.getAttribute("id");
		String showmessagebuttonfontcolour = showmessagebuttonfontcolor.getCssValue("color");
		softassert.assertEquals(showmessagebuttonfontcolour,color,"the color is not equal");
		String weight="400";
		WebElement gettotalbutton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String classnamefontweight = gettotalbutton.getAttribute("id");
		String fontweightofgettotalbutton = gettotalbutton.getCssValue("font-weight");
		softassert.assertEquals(fontweightofgettotalbutton,weight,"The fontweightof gettotal is not equals to weight");
		softassert.assertAll();
	}
	
	
	
	
	}

