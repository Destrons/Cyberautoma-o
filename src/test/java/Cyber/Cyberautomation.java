package Cyber;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cyberautomation { 

	private WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		

		//driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in");
		driver.findElement(By.xpath("/html/body/div[1]/a[2]/button")).click();
		
		Thread.sleep(1000);
		
		assertTrue("Título correto", driver.getTitle().contentEquals("Register"));
		
		//preencher campo nome
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Thomas");
		
		Thread.sleep(500);
		
		//preencher campo ultimo nome
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Pereira");
		
		Thread.sleep(500);
		
		//preencher campo Endereço
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("R. Codificação N°:80");
		
		Thread.sleep(500);
		
		//preencher campo E-mail
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("Thomas_neves@ymail.com");
		
		Thread.sleep(500);
				
		//preencher campo Endereço
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("11999999999");
		
		Thread.sleep(500);
		
	//Escolher radio Genero
		WebElement radio = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
		radio.click();
		
		Thread.sleep(500);
				
	//escolher checkbox hobbies
		WebElement checkbox = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input"));
		checkbox.click();
		WebElement checkbox1 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[3]/input"));
		checkbox1.click();
		
		Thread.sleep(500);
		
		//rolar scroll down 50%
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		
	//Escolher linguagem
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[29]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div")).click();
		
		Thread.sleep(500);
		
	//Escolher habilidades
		WebElement skill_dropdown=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
		Select skill=new Select(skill_dropdown);
		skill.selectByValue("Java");
		
		Thread.sleep(500);
	
	//Escolher Continente
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("united");
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li")).click();
		
		Thread.sleep(500);
		
	//Escolher data nascimento
		//Ano
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[80]")).click();
		Thread.sleep(500);
		//Mês
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[4]")).click();

		Thread.sleep(500);
		//Dia
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[5]")).click();
		Thread.sleep(500);
		
	//Escrever senha e confirmar senha
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input")).sendKeys("Teste1234");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input")).sendKeys("Teste1234");
		Thread.sleep(500);
		
	//rolar scroll topo
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,-350)");
		
		Thread.sleep(500);
		
	//enviar photo
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[2]/input")).sendKeys("C:\\Users\\Programer\\Desktop\\void.jpg");
	
		
		Thread.sleep(5000);
	}

}
