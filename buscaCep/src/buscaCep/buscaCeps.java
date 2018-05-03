package buscaCep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buscaCeps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\640244\\eclipse-workspace\\buscaCep\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/");
		
		WebElement cep = driver.findElement(By.name("relaxation"));
		cep.click();
		cep.sendKeys("Rua Domingos de Morais");
		cep.sendKeys(Keys.ENTER);
		
		WebElement lista = driver.findElement(By.xpath("//table[@class='tmptabela']"));
		lista.getText();
		
		
	}

}
