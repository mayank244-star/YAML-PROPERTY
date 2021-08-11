package file;

import java.util.concurrent.TimeUnit;
import java.util.*;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws IOException {

		FileInputStream fis =new FileInputStream("C:\\Users\\user\\project\\YAMLvsPROPERTY\\src\\main\\resources\\new1.properties");
		Properties prop = new Properties();
		 prop.load(fis);
		 String chrome= prop.getProperty("chrome");
		 System.out.println(chrome);
		 String vdriver1= prop.getProperty("vdriver");
		 System.out.println(vdriver1);
		 String username= prop.getProperty("mobileno");
		 System.out.println(username);
	 //   int password =  prop.getProperty("password");      Cannot cast from string to integer
		ArrayList password = (ArrayList)prop.getProperty("password");    //cannot cast string to ArrayList
		// String password= prop.getProperty("password");
	    System.out.println(password);
	   

	    	 			
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	 		 
	    	 WebDriver driver = new ChromeDriver();	
			    
			        driver.manage().window().maximize();
			        String  url="https://www.flipkart.com/";
			        driver.get(url);
			        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys(username);
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys(password);
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
			
}

}