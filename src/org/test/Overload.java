package org.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Overload {

	static WebDriver driver;

	public static void datePicker(String date) {
		WebElement table = driver.findElement(By.xpath("(//table[@class='rb-monthTable first last'])[2]"));

		List<WebElement> tRows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < tRows.size(); i++) {

			List<WebElement> tData = tRows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < tData.size(); j++) {

				String text = tData.get(j).getText();
				System.out.println(text);
				if (text.equals(date)) {
					tData.get(j).click();
				}

			}

		}

	}

	public static void click(String name) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(name)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void call(String name1) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(name1)).sendKeys("Salem");;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Javas\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		//Alert a=driver.switchTo().alert();
		//a.accept();
		call("(//input[@class='db'])[1])");

		click("//*[text()='Onward Date']");

		datePicker("31");
		

	}

}
