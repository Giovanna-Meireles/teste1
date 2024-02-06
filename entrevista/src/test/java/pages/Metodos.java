package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador(String appURL, String descricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "/Users/teiga/Documents/Drivers/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/teiga/eclipse-workspace/giovanna/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(appURL);
	}
	
	public void maximixarNavegador() {
		driver.manage().window().maximize();
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
	
	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
		
	}
		
	public void click(By elemento) {
		driver.findElement(elemento).click();
	
		
	}
	
	
	public void validarTexto (String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assetEquals(textoEsperado,texto);
	}
	
	private void assetEquals (String textoEsperado, String texto) {
		
	}

}
