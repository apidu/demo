package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {
	public static Properties prop;
	public static WebDriver driver;

	public Baseclass() {

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\tavis\\2023practticse\\Hybridproject\\src\\main\\java\\ConfigLayer\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initlization() {

		String BrowserName = prop.getProperty("Browsername");
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Chromedriver Selected");
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			
			
			if (BrowserName.equalsIgnoreCase("eged")) {
				System.setProperty("webdriver.chrome.driver", "‪C:\\Driver\\egededriver.exe");
				driver = new EdgeDriver();

			}
			

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));

	}
	
	
}