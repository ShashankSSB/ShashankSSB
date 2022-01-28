import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class JustDialPopUp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
//	ChromeOptions co=new ChromeOptions();
//	co.addArguments("--disable-notifications");
//	WebDriver driver=new ChromeDriver(co);
	//driver.manage().window().maximize();
	//driver.get("https://www.justdial.com/");
	FirefoxProfile ff=new FirefoxProfile();
	ff.setPreference("dom.webnotification.enabled", false);
	FirefoxOptions fo=new FirefoxOptions();
	fo.setProfile(ff);
	WebDriver driverr =new FirefoxDriver(fo);
	driverr.manage().window().maximize();
	driverr.get("https://www.justdial.com/");
	
	
	
	}
}
