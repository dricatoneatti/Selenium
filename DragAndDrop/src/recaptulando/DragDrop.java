package recaptulando;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import suporte.generator;
import suporte.screenshots;

public class DragDrop {
	public static void main (String[] args) {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\640244\\eclipse-workspace\\recaptulando\\chrome\\chromedriver.exe");
	WebDriver navegador = new ChromeDriver();
	navegador.get("http://jqueryui.com/resources/demos/droppable/default.html");

	WebElement pegar = navegador.findElement(By.id("draggable"));
	WebElement arrastar = navegador.findElement(By.id("droppable"));
	
	Actions actions = new Actions(navegador);
	actions.dragAndDrop(pegar, arrastar).perform();
	
	screenshots.tirar(navegador, "C:\\Users\\640244\\Documents\\TREINAMENTO SELENIUM\\Screenshots\\" + generator.dataHoraParaArquivo()+ "oioi.png");
	
	navegador.close();
	
	
}
}