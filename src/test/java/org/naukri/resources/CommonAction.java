package org.naukri.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction  {
	//public static String W1;
	//public static String C1;
	//public static String D1;
	public static WebDriver driver;
	public void browserLaunch() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\NaukriCucumber\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions C=new ChromeOptions();
		//C.addArguments("start-maximized");
		//C.addArguments("--headless");
		driver=new ChromeDriver(C);
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void Screenshot() throws Throwable {
		TakesScreenshot S= (TakesScreenshot)driver;
		File F=S.getScreenshotAs(OutputType.FILE);
		File L=new File("C:\\Users\\ASUS\\eclipse-workspace\\NaukriCucumber\\SS\\Screenshot");
		FileUtils.copyFile(F,L);
	}
	public void Excel() throws Throwable {
		File F=new File("C:\\Users\\ASUS\\eclipse-workspace\\NaukriCucumber\\SS\\Naukri.xlsx");
		Workbook W=new XSSFWorkbook();
		Sheet S=W.createSheet("Sheet1");
		for(int i=0;i<20;i++) {
		Row R=S.createRow(i);
		for(int j=0;j<3;j++) {
			Cell C=R.createCell(j);
			if(j==0) {
			C.setCellValue("");
		}
		if(j==1) {
			C.setCellValue("");}
		if(j==2) {
			C.setCellValue("");}
		}
		FileOutputStream F1=new FileOutputStream(F);
		W.write(F1);
		}
		
	}

	
	public void browserQuit() {
		driver.quit();
	}
	
	
}
