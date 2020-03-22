package com.w2a.pages.CRM.Accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccountPage extends Page{

	public void createAccount(String accountName) {
		
		type("accountname_XPATH",accountName);

	}

}
