package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.CRM.CRMHomePage;

public class ZohoAppPage extends Page{

	public void gotoBooks() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[1]/div/a/div")).click();

	}

	public void gotoCalendar() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[2]/div/a/div")).click();

	}

	public void gotoCampaigns() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[3]/div/a/div")).click();

	}

	public void gotoClip() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[4]/div/a/div")).click();

	}

	public void gotoConnect() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[5]/div/a/div")).click();

	}

	public  CRMHomePage gotoCRM() {

		click("crmlink_XPATH");
		
		return new CRMHomePage();
		
	}

	public void gotoDesk() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/div")).click();

	}

	public void gotoInvoice() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[8]/div/a/div")).click();

	}

	public void gotoMail() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[9]/div/a/div")).click();

	}

	public void gotoSheet() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[10]/div/a/div")).click();

	}

	public void gotoShow() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[11]/div/a/div")).click();

	}

	public void gotoWorkDrive() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[12]/div/a/div")).click();

	}
	
	public void gotoWriter() {

		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[13]/div/a/div")).click();

	}

}
