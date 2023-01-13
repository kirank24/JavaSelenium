package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com");
	}

}
