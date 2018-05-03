package exercicio2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cadastroAzul {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\640244\\eclipse-workspace\\exercicio2\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.voeazul.com.br/tudoazul/cadastro-rapido");
		
		WebElement nome = driver.findElement(By.id("nome"));
		nome.click();
		nome.sendKeys("Adriana");
		nome.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("sobrenome")).sendKeys("Toneatti");

		WebElement cpf = driver.findElement(By.id("cpf"));
		cpf.click();
		cpf.sendKeys("43947451873");
		cpf.sendKeys(Keys.TAB);
		 
		WebElement nascimento = driver.findElement(By.id("data"));
		nascimento.sendKeys("06031999");
		
		driver.findElement(By.id("genero")).click();
		
		WebElement cel = driver.findElement(By.id("celular"));
		cel.click();
		cel.sendKeys("11943399423");
		cel.sendKeys(Keys.TAB);
		
		WebElement cep = driver.findElement(By.id("cep"));
		cep.sendKeys("04050050");
		cep.sendKeys(Keys.TAB);
		
		WebElement numerocep = driver.findElement(By.id("end_num"));
		numerocep.sendKeys("99");
		numerocep.sendKeys(Keys.TAB);
			
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("toneattiadriana1@gmail.com");
		email.sendKeys(Keys.TAB);
		
		WebElement senha = driver.findElement(By.id("senha"));
		senha.sendKeys("querodormir123");
		senha.sendKeys(Keys.TAB);

		WebElement confsenha = driver.findElement(By.id("confirmacao"));
		confsenha.sendKeys("querodormir123");

		driver.findElement(By.id("submit")).click();
		
		
		
		
		 
		
	}

}
