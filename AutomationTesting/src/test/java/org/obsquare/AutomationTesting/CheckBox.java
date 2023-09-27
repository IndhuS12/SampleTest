package org.obsquare.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	public void checkBoxCommands() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//label[@for='gridCheck']"));
		clickonthischeckbox.click();
		boolean ischeckboxbuttonselected = clickonthischeckbox.isSelected();
	}

	public static void main(String args[]) {
		CheckBox checkbox = new CheckBox();
		checkbox.InitializeBrowser();
		checkbox.checkBoxCommands();
		checkbox.driverClose();

	}
}
