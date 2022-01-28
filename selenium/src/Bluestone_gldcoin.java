import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone_gldcoin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement searchbox =driver.findElement(By.name("q"));
		boolean dis=searchbox.isDisplayed();
		System.out.println(dis);
		searchbox.sendKeys("www.bluestone.com");
		Thread.sleep(2000);
		List<WebElement> sugges =driver.findElements(By.xpath("/a[contains(.,'All Jewellary')"));
		Thread.sleep(2000);
		for(WebElement sugg :sugges)
		{
			System.out.println(sugg.getText());
			Thread.sleep(2000);
			sugges.get(3).click();
			}
		}


	}


