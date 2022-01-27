
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_SC6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Rings", Keys.ENTER);
		Thread.sleep(2000);
		WebElement cost =driver.findElement(By.xpath("//section[@id='Price-form']"));
		Actions a = new Actions(driver);
		a.moveToElement(cost).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'18')]")).click();
		List<WebElement> rings = driver.findElements(By.xpath("//ul[@class='product-grid search-box-result']/li"));
		int count = 0;
		for (WebElement ring : rings) {
			count++;
		}
		System.out.println("No of below 10000 "+(count-1));

	}
}