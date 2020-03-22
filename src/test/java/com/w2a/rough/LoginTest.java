package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.CRM.CRMHomePage;
import com.w2a.pages.CRM.Accounts.AccountsPage;
import com.w2a.pages.CRM.Accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {

		//this is rough package
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("divyapeddakotla@gmail.com", "Chandana1@");
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("Divya");
		
		
	}
 
}
