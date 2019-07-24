package com.training.pom;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath ="//a[contains(text(),'Course ')][1]")
	private WebElement courseCatalog;
	
	@FindBy(className ="form-control")
	private WebElement search;
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement clickSearch;
	@FindBy(xpath ="//a[contains(text(),'Edit profile')]")
	private WebElement editProfile;
	@FindBy(name ="password0")
	private WebElement existPassword;
	@FindBy(name ="password1")
	private WebElement newPassword;
	@FindBy(name ="password2")
	private WebElement confirmPassword;
	@FindBy(id="profile_apply_change")
	private WebElement saveChange;
	@FindBy (xpath="//a[text()=' I lost my password ']")
	private WebElement clickForgotPasword;
	@FindBy (id="lost_password_user")
	private WebElement usermail;
	@FindBy (id="lost_password_submit")
	private WebElement sendmessage;
	
			
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCourseCatalogue()
	{
		this.courseCatalog.click();
	}
	public void searchCourse(String searchName)
	{
		this.search.clear();
		this.search.sendKeys(searchName);
	}
	public void clickSearch()
	{
		this.clickSearch.click();
	}
	
	public void clickEditProfile()
	{
		this.editProfile.click();
	}
	
	public void sendExistingPassword(String newPassword)
	{
		this.existPassword.clear();
		this.existPassword.sendKeys(newPassword);
	}
	public void sendNewPassword(String newPassword)
	{
		this.newPassword.clear();
		this.newPassword.sendKeys(newPassword);
	}
	public void confirmNewPassword(String newPassword1)
	{
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(newPassword1);
	}
	
	public void  applyChanges()
	{
		this.saveChange.click();
	}
	public void clickLostPassword()
	{
		this.clickForgotPasword.click();
	}
	
	public void sendUserMail(String usermail)
	{
		this.usermail.clear();
		this.usermail.sendKeys(usermail);
	}
	public void clicksubmitmail()
	{
		this.sendmessage.click();
	}
}

