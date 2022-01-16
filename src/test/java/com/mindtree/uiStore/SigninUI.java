package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class SigninUI {
	
	public static By signin = By.xpath("//span[contains(text(),'Sign In')]");
	public static By email = By.xpath("//input[@placeholder='Email']");
	public static By password =By.xpath("//input[@placeholder='Password']");
	public static By login = By.xpath("//span[contains(text(),'Login')]");
	public static By myacc = By.xpath("//span[contains(text(),'Hi, madhesh')]");

}