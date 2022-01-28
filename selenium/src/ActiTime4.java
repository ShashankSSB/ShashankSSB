import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		WebElement usernametf = driver.findElement(By.xpath("//input[@id='username']"));

		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		ww.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//input[@id='username']"), "admin"));
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}
}
