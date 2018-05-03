package prints;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prints {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\640244\\eclipse-workspace\\dia2\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
				
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				        try {
				            FileUtils.copyFile(scrFile, new File("printOLX.png"));
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
		

	}

}
