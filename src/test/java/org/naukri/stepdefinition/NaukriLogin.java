package org.naukri.stepdefinition;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.naukri.objectrepository.CreationPage;
import org.naukri.resources.CommonAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NaukriLogin extends CommonAction{
	CommonAction C=new CommonAction();
	CreationPage P=new CreationPage();
	@Given("User Launch the Naukri Application")
	public void user_Launch_the_Naukri_Application() {
	    P.getLogin().click();
	}

	@When("User Login the Naukri Application")
	public void user_Login_the_Naukri_Application() {
		P.getIdUser().sendKeys("krishnaraj9825@gmail.com");
		P.getIdPass().sendKeys("Krishna@25");
		P.getEnter().click();
	}

	@When("User Search and Select the Job")
	public void user_Search_and_Select_the_Job() throws Throwable {
		P.getX().click();
		P.getKey().sendKeys("Software Testing");
	    P.getLoc().sendKeys("Chennai");
	    P.getSearch().click();
	}

	@When("User get the jobs")
	public void user_get_the_jobs() throws Throwable {
		List<WebElement>Days=P.getDays();
		List<WebElement>Work=P.getWork();
		List<WebElement>Com=P.getCom();
		List<WebElement>Exp=P.getExperience();
			File F=new File("C:\\Users\\ASUS\\eclipse-workspace\\NaukriCucumber\\src\\test\\resources\\Excel\\Book2.xlsx");
			Workbook WB=new XSSFWorkbook();
			Sheet S=WB.createSheet("Sheet1");
			for(int i=0;i<Days.size();i++) {
			Row R=S.createRow(i);
			WebElement W=Work.get(i);
			String W1=W.getText();
			System.out.println(W1);
			WebElement C=Com.get(i);
			String C1=C.getText();
			System.out.println(C1);
			WebElement E=Exp.get(i);
			String E1=E.getText();
			System.out.println(E1);
			WebElement D=Days.get(i);
			String D1=D.getText();
			System.out.println(D1);
			for(int j=0;j<=3;j++) {
				if(j==0) {
				Cell CL=R.createCell(j);
				CL.setCellValue(W1);
			}else if(j==1) {
				Cell CL=R.createCell(j);
				CL.setCellValue(C1);
			}else if(j==2) {
				Cell CL=R.createCell(j);
				CL.setCellValue(E1);
			}else if(j==3) {
				Cell CL=R.createCell(j);
				CL.setCellValue(D1);
			}
			}
			}FileOutputStream F1=new FileOutputStream(F);
			WB.write(F1);
			}
}
//}
//WebElement D=Days.get(k);
//String D1=D.getText();
//if(D1.equals("7 DAYS AGO")||D1.equals("6 DAYS AGO")||D1.equals("5 DAYS AGO")||D1.equals("4 DAYS AGO")||D1.equals("3 DAYS AGO")||D1.equals("2 DAYS AGO")||D1.equals("1 DAY AGO")||D1.equals("JUST NOW")) {
//WebElement W=Work.get(k);
//String W1=W.getText();
//WebElement C=Com.get(k);
//String C1=C.getText();
//System.out.println(W1);
//System.out.println(C1);
//System.out.println(D1);
//}