package com.juaracoding.Minggu5.Bdd.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.Minggu5.Bdd.Driver.DriverSingleton;

public class SignIn {

	private WebDriver driver;
	
	public SignIn() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement inputEmail;
	
	@FindBy(id="passwd")
	private WebElement inputPassword;
	
	@FindBy(id="SubmitLogin")
	private WebElement btnSubmit;
	
	@FindBy(css= "#center_column > p")
	private WebElement txtWelcome;
	
	@FindBy(css ="#block_top_menu > ul > li:nth-child(1)")
	private WebElement btnWomen;
	
	public void loginForm(String email, String password) {
		inputEmail.sendKeys(email);
		inputPassword.sendKeys(password);
		btnSubmit.click();
	}
	
	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
}
