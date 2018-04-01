package Allocator;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class Allocator {

	protected WiniumDriver driver;
	String calcPath = "C:\\Windows\\System32\\calc.exe";
	String winiumDriverPath = "F:\\Winium\\Winium.Desktop.Driver.exe";
	String outlookPath = "C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\OUTLOOK.exe";
	String excelPath = "C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\EXCEL.exe";

	public WiniumDriver setupEnvironment(String App) throws IOException {
		DesktopOptions options = new DesktopOptions(); // Initiate Winium Desktop Options

		switch (App) {
		case "Calculator":
			options.setApplicationPath(calcPath);
			break;
		case "Outlook":
			options.setApplicationPath(outlookPath);
			break;
		case "Excel":
			options.setApplicationPath(excelPath);
		}

		File drivePath = new File(winiumDriverPath);
		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(drivePath).usingPort(9999)
				.buildDesktopService();
		service.start();
		driver = new WiniumDriver(service, options);
		return driver;

	}
}
