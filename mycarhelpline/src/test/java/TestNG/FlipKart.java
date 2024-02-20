package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {
 
	static WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mycarhelpline.com/");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("mycarhelpline"));
	}
	
	@Test(priority = 1)
	private void HomePage() throws InterruptedException {
	WebElement NewCar = driver.findElement(By.xpath("(//option[text()='Landrover'])[1]"));
    NewCar.click();
    WebElement CarModel = driver.findElement(By.xpath("(//option[text()='Discovery Sport'])"));
    CarModel.click();
    WebElement SearchButton = driver.findElement(By.xpath("(//input[@value='Search Now'])[1]"));
    SearchButton.click();
    Thread.sleep(2000);
    WebElement HomePage = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
    HomePage.click();
    WebElement UsedCar = driver.findElement(By.xpath("(//option[text()='Maruti'])[2]"));
    UsedCar.click();
    Thread.sleep(2000);
    WebElement CarModel2 = driver.findElement(By.xpath("//option[text()='800']"));
    CarModel2.click();
    Thread.sleep(2000);
    WebElement SearchButton2 = driver.findElement(By.xpath("(//input[@value='Search Now'])[2]"));
    SearchButton2.click();
    Thread.sleep(2000);
    WebElement HomePage2 = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
    HomePage2.click();
	}
	
	@Test(priority = 2)
	private void ReviewPage() {
		WebElement Review = driver.findElement(By.xpath("//a[text()='Reviews']"));
		Review.click();
		WebElement review_button = driver.findElement(By.xpath("//img[@alt='Swift Vs Grand i10 Nios']"));
		review_button.click();
		
	}
	
	@Test(priority = 3)
	private void Calculation() {
		WebElement Calulation = driver.findElement(By.xpath("//a[text()='Calculator']"));
		Calulation.click();
		WebElement carloanemi = driver.findElement(By.xpath("//img[@alt='Car Loan EMI Calculator']"));
		carloanemi.click();
		WebElement Loamanount = driver.findElement(By.xpath("//input[@name='loan']"));
		Loamanount.sendKeys("500000");
		WebElement termsofmonths = driver.findElement(By.xpath("//input[@name='months']"));
		termsofmonths.sendKeys("10");
		WebElement interst_rate = driver.findElement(By.xpath("//input[@name='rate']"));
		interst_rate.sendKeys("10");
		WebElement submitebutton = driver.findElement(By.xpath("(//input[@name='Submit'])[1]"));
		submitebutton.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	private void afterclass() {
	//driver.quit();

	}
}
