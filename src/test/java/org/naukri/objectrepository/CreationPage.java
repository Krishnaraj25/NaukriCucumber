package org.naukri.objectrepository;

import java.util.List;

import org.naukri.resources.CommonAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreationPage extends CommonAction {
	public CreationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='name']")
	private WebElement Name;
	@FindBy(id="email")
	private WebElement Email;
	@FindBy(id="password")
	private WebElement Pass;
	@FindBy(id="mobile")
	private WebElement Mobile;
	@FindBy(xpath="(//h2[@class='main-3'])[1]")
	private WebElement Exp;
	@FindBy(xpath="(//button[@type='submit'])")
	private WebElement Register;
	@FindBy(xpath="//div[text()='Login']")
	private WebElement Login;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement IdUser;
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement IdPass;
	@FindBy(xpath="(//button[@type='submit'])")
	private WebElement Enter;
	@FindBy(xpath="//div[@class='crossIcon chatBot chatBot-ic-cross']")
	private WebElement X;
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement Key;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Loc;
	@FindBy(xpath="//button[text()='SEARCH']")
	private WebElement Search;
	@FindBy(xpath="//span[@class='fleft fw500']")
	private List<WebElement> Days;
	@FindBy(xpath="//a[@class='title fw500 ellipsis']")
	private List<WebElement> Work;
	@FindBy(xpath="//a[@class='subTitle ellipsis fleft']")
	private List<WebElement> Com;
	@FindBy(xpath="//li[@class='fleft grey-text br2 placeHolderLi experience']")
	private List<WebElement> Experience;
	public List<WebElement> getExperience() {
		return Experience;
	}
	public void setLoc(WebElement loc) {
		Loc = loc;
	}
	public WebElement getLogin() {
		return Login;
	}
	public WebElement getIdUser() {
		return IdUser;
	}
	public WebElement getIdPass() {
		return IdPass;
	}
	public WebElement getEnter() {
		return Enter;
	}
	public WebElement getX() {
		return X;
	}
	public WebElement getKey() {
		return Key;
	}
	public WebElement getLoc() {
		return Loc;
	}
	public WebElement getSearch() {
		return Search;
	}
	public List<WebElement> getWork() {
		return Work;
	}
	public List<WebElement> getCom() {
		return Com;
	}
	public List<WebElement> getDays() {
		return Days;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPass() {
		return Pass;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getExp() {
		return Exp;
	}
	public WebElement getRegister() {
		return Register;
	}
	
}
