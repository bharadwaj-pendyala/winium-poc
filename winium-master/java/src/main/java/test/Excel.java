package test;

import java.io.IOException;
import java.net.SocketException;

import org.openqa.selenium.By;

import Allocator.Allocator;

public class Excel extends Allocator {

	public void ExcelOps() throws IOException, InterruptedException, SocketException {
		setupEnvironment("Excel");
		Thread.sleep(1000);
		driver.findElement(By.name("Blank workbook")).click();
		driver.findElement(By.name("A1")).sendKeys("1");
		driver.findElement(By.name("A2")).sendKeys("2");
		driver.findElement(By.name("A3")).sendKeys("=A1+A2");
		driver.findElement(By.name("A4")).click();
		System.out.println("Execution has been successful");
	}

	public static void main(String args[]) throws InterruptedException, IOException, SocketException {
		Excel c = new Excel();
		c.ExcelOps();
	}

}
