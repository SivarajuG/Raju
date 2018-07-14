package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flipkart.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Men"));

	}

}
