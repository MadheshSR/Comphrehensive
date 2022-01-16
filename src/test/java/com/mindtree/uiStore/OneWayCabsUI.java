package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class OneWayCabsUI {
	
	public static By onewaycab = By.xpath("//a[contains(text(),'One way cabs')]");
	public static By chennaitab = By.xpath("//span[@id='tabChennai']");
	public static By trl = By.xpath("//div[contains(text(),'Chennai to Tiruvallur one way taxi')]");
	public static By to = By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']");
	public static By Desti = By.xpath("//span[contains(text(),'Tiruvallur')]");
	public static By select = By.xpath("//button[contains(text(),'Select Car')]");
	public static By selectcar= By.xpath("//button[contains(text(),'Select')]");
	public static By location = By.xpath("//input[@id='search_places']");
	public static By locat = By.xpath("//span[contains(text(),'Chennai - Tiruvallur High Road')]");
	public static By proceed = By.xpath("//span[contains(text(),'Proceed')]");
	public static By book = By.xpath("//span[contains(text(),'Book Now')]");
	public static By popup = By.xpath("//div[@id='modal']");
	public static By home = By.xpath("//header/div[1]/div[1]/a[1]/img[1]");
			

}
