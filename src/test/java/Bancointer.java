import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class Bancointer {
	
static WebDriver driver;

	@Before
	
public void setUp() throws Exception {
		
		// codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		//comando para chamar o driver dentro do before
		driver = new ChromeDriver();
		// comando para indicar URL
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"bt_gerar_pessoa\"]")).click();
		Thread.sleep(1000);
		String nome = driver.findElement(By.xpath("//*[@id=\"nome\"]")).getText();
		String celular = driver.findElement(By.xpath("//*[@id=\"celular\"]")).getText();
		String email = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
		String cpf = driver.findElement(By.xpath("//*[@id=\"cpf\"]")).getText();
		String datanasc = driver.findElement(By.xpath("//*[@id=\"data_nasc\"]")).getText();
		




		
	    driver.get("https://www.bancointer.com.br/");
	    Thread.sleep(1000);
		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
		 Thread.sleep(1000);
		driver.findElement(By.id("nome")).sendKeys(nome);
		driver.findElement(By.id("celular")).sendKeys(celular);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("cpf")).sendKeys(cpf);
		driver.findElement(By.id("dataNascimento")).sendKeys(datanasc);
		driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button")).click();
		
		
		
	}
	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		String texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
	    System.out.println(texto);
	    assertEquals("Prontinho! Recebemos os seus dados.",texto);	   
	}

}
	
	

