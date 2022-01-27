import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAlfqOBhAeEiwAYi43F_SxPB3q1GirfgFmF-uDMY_tMHCKQCUsNrbCt-JkEhhZi0tBftJf9hoC79gQAvD_BwE");
		Thread.sleep(2000);
		WebElement alljewl = driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(alljewl).build().perform();
		//a.moveToElement(alljewl).perform();
	}
}
