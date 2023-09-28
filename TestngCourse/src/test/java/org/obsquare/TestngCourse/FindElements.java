package org.obsquare.TestngCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base {

	@Test
	public void findElementsExample() {
		String input = "Jquery Select2";
		List<WebElement> menu = driver.findElements(By.xpath("//ul[contains(@class,'list-group-flush')]"));
		for (WebElement Listing : menu) {
			String link = Listing.getText();
			if (menu.equals(input))
				Listing.click();
			break;

		}

	}

}
