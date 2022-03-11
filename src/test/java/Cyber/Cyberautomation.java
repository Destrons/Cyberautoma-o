package Cyber;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		

		driver.manage().window().maximize();
		
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
		
		Thread.sleep(1000);
		
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
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li")).click();
		
		Thread.sleep(500);
		
	//Escolher data nascimento
		//Ano
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[75]")).click();
		Thread.sleep(500);
		//Mês
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[3]")).click();

		Thread.sleep(500);
		//Dia
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[7]")).click();
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
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(500);
		
		//Escrever dentro de uma frame
		driver.switchTo().frame("SingleFrame");
	
		driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]")).click();
		driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]")).sendKeys("Escrita automática");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		//Escrever dentro de uma frame que está dentro de outra frame 		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
				
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Escrita automática dois");
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
				
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		Thread.sleep(500);
		
		//selecionar data disabled
		driver.findElement(By.id("datepicker1")).click();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker")));

		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearVal);
		String month = monthYearVal.split(" ")[0].trim();
		String year = monthYearVal.split(" ")[1].trim();
		
		while(!(month.equals("March") && year.equals("2015"))) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(monthYearVal);
			month = monthYearVal.split(" ")[0].trim();
			year = monthYearVal.split(" ")[1].trim();
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[4]/a")).click();
		
		Thread.sleep(500);
		
		//selecionar data enabled
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[3]/input")).click();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[3]/input")).sendKeys("03/04/2015");
		driver.findElement(By.xpath("/html/body/section")).click();
		
		Thread.sleep(1000);
		
		driver.get("http://demo.automationtesting.in/Slider.html");
		
		Thread.sleep(500);
		
		//rolar scroll direita 50%	
		WebElement slider = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/a"));
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 337, 0 ).perform();		
			
		Thread.sleep(10000);
	
	}

}
