import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone1_ {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement alljewl=driver.findElement(By.xpath("//a[contains(.,'All Jewellary')]"));
		Actions a= new Actions(driver);
		a.moveToElement(alljewl).build().perform();
		Thread.sleep(2000);
		driver.close();
	
}
}

