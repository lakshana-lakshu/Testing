package com.seleniumdemoapplication.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		WebDriver driverChrome=new ChromeDriver();
		
		driverChrome.get("https://www.shoppersstop.com");
		driverChrome.findElement(By.className("user-icon")).click();
		driverChrome.close();
		SpringApplication.run(DemoApplication.class, args);
	}

}
