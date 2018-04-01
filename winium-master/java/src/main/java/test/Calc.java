package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import Allocator.Allocator;

public class Calc extends Allocator {

	public void addNumberTest() throws InterruptedException, IOException {

		setupEnvironment("Calculator");
		Thread.sleep(5000);
		driver.findElement(By.name("Seven")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Eight")).click();
		driver.findElement(By.name("Equals")).click();

	}

	public static void main(String args[]) throws InterruptedException, IOException {
		Calc c = new Calc();
		c.addNumberTest();

	}

}