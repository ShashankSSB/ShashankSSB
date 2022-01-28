package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone2_ // Search for ring in the search bar
{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//[@class=form-text typehead']")).sendKeys("Rings",Keys.ENTER);
		driver.findElement(By.xpath("//[@alt='The Thom Ring']")).click();
		Set<String> window=driver.getWindowHandles();
		ArrayList<String> win=new ArrayList<>(window);
		driver.switchTo().window(win.get(1));
		driver.findElement(By.xpath("//[@id=buy-now']")).click();
		WebElement msg=driver.findElement(By.xpath("[@class='formErrorContent']"));
		System.out.println(msg.getText());
		
	

}
}
