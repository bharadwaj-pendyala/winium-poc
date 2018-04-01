package test;

import java.io.IOException;
import java.net.SocketException;

import org.openqa.selenium.By;

import Allocator.Allocator;

public class MSOutlook extends Allocator {

	public void openOutlook() throws InterruptedException, IOException {
		setupEnvironment("Outlook");
		Thread.sleep(10000);
		driver.findElement(By.name("File Tab")).click();
		driver.findElement(By.name("Exit")).click();
	}

	public static void main(String args[]) throws InterruptedException, IOException, SocketException {
		MSOutlook c = new MSOutlook();
		c.openOutlook();
		System.out.println("Execution has been successful");
	}

}
