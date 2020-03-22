package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page{


	public void goToSupport() {

		driver.findElement(By.cssSelector("[class = 'zh-support']")).click();

	}

	public void goToSignup() {

		driver.findElement(By.cssSelector("[class = 'zh-signup']")).click();

	}

	public LoginPage goToLogin() {

		//driver.findElement(By.cssSelector("[class = 'zh-login']")).click();
		click("loginlink_CSS");
		return new LoginPage();
	}

	public void goToEnglish() {

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/span")).click();

	}

	public void goToLearnMore() {

		driver.findElement(By.cssSelector("a[class = 'learn-more']")).click();

	}

	public void validateFooterLinks() {

		//driver.findElement(By.cssSelector("[class = 'zh-login']")).click();

	}
}
