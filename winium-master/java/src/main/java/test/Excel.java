package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Allocator.Allocator;

public class Excel extends Allocator {

	public void ExcelOps() throws IOException, InterruptedException {
		setupEnvironment("Excel");
		Thread.sleep(1000);
		driver.findElement(By.name("Blank workbook")).click();
		driver.findElement(By.name("A1")).sendKeys("1");
		driver.findElement(By.name("A2")).sendKeys("2");
		driver.findElement(By.name("A3")).sendKeys("=A1+A2");
		driver.findElement(By.name("A4")).click();
	}

	public static void main(String args[]) throws InterruptedException, IOException {
		Excel c = new Excel();
		c.ExcelOps();
	}

}
