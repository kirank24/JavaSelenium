package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FristScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com");
		
		driver.manage().window().maximize();

	}

}
