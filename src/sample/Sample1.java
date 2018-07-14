package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//int i=1;
		//While(i<=2);
		{
			//System.setProperty("webdriver.chrome.driver", "C:/Users/RAJU/AppData/Roaming/Microsoft/Internet Explorer/Quick Launch/User Pinned/TaskBar/chrome.exe");
			WebDriver d=new FirefoxDriver();
			d.get("https://www.facebook.com");
			d.get("https://mail.google.com");
			d.navigate().forward();
			Thread.sleep(2000);
			d.navigate().back();
			d.navigate().forward();
			//i++;
			d.close();
			d.quit();
			
		}

	}

	

	
}
