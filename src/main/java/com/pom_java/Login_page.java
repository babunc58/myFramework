package com.pom_java;

import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_page {

	static WebDriver driver = new ChromeDriver();
	
	public  static String initDriver(String url) {
		
		driver.manage().window().maximize();
		driver.get(url);
		return url;
		
	}
	
	public static String username(String user) {
		argsPassing(driver.findElement(By.xpath("//input[@id='username']")), user);
		return user;
	}

	public static String password( String pass) {
//		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/index.php");
		
		argsPassing(driver.findElement(By.xpath("//input[@id='password']")), pass);
		
		return pass;
	}
	
	public static WebElement login() {
		WebElement loginButton= driver.findElement(By.xpath("//input[@id='login']"));
		clickAt(loginButton);
		return loginButton;
		
	}
	public static WebElement homepage() {
		WebElement Homepage= driver.findElement(By.xpath("//a[text()='Logout']"));
		return Homepage;
	}
	
	public static  void selection(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	public static void argsPassing(WebElement element1, String value) {
		element1.sendKeys(value);
	}

	public static void clickAt(WebElement element2) {
		element2.click();
	}

	public static void sleepfor(long i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void screenShot(String fileName) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\karth\\Desktop\\Selenium\\New_maven\\JenkinTry\\Screenshot\\" + fileName + ".png");
		try {
			FileUtils.copyFile(screenshot, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

//	public static void main(String[] args) {
//
//		login("babunc58", "Chellamuthu4858");
//		// ========================nextpage==========================================================
//		selection(driver.findElement(By.id("location")), 1);
//		selection(driver.findElement(By.id("hotels")), 2);
//		selection(driver.findElement(By.xpath("//select[@name='room_type']")), 3);
//		selection(driver.findElement(By.id("room_nos")), 6);
//		argsPassing(driver.findElement(By.id("datepick_in")), "20/07/2023");
//		argsPassing(driver.findElement(By.id("datepick_out")), "23/07/2023");
//		selection(driver.findElement(By.id("adult_room")), 2);
//		selection(driver.findElement(By.id("child_room")), 3);
//		screenShot("details");
//		clickAt(driver.findElement(By.xpath("//input[@value='Search']")));
//		sleepfor(3000);
//		// ========================nextpage===========================================================
//		clickAt(driver.findElement(By.id("radiobutton_0")));
//		clickAt(driver.findElement(By.id("continue")));
//		sleepfor(3000);
//		// ========================nextpage===========================================================
//		argsPassing(driver.findElement(By.id("first_name")), "Naveenbabu");
//		argsPassing(driver.findElement(By.id("last_name")), "Chellamuthu");
//		argsPassing(driver.findElement(By.id("address")), "vennaimalai,karur");
//		argsPassing(driver.findElement(By.id("cc_num")), "1234567890123456");
//		selection(driver.findElement(By.id("cc_type")), 2);
//		selection(driver.findElement(By.id("cc_exp_month")), 5);
//		selection(driver.findElement(By.id("cc_exp_year")), 14);
//		argsPassing(driver.findElement(By.id("cc_cvv")), "123");
//		clickAt(driver.findElement(By.id("book_now")));
//		sleepfor(10000);
//		// ========================nextpage===============================================================
//		clickAt(driver.findElement(By.id("logout")));
//		// =========================screenshot==============================================================
//		screenShot("Adactin_logout");
//
//	}
}
