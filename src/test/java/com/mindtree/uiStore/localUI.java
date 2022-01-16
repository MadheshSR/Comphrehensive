package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class localUI {
	
	public static By local = By.xpath("//span[contains(text(),'Local')]");
	public static By from = By.xpath("//input[@id='fromCityList']");
	public static By froms = By.xpath("//button[@id='ngb-typeahead-8-1']");
	public static By select = By.xpath("//button[contains(text(),'Select Car')]");
	public static By time = By.xpath("//button[contains(text(),'12 hrs | 120 km')]");
	public static By selectcar= By.xpath("//button[contains(text(),'Select')]");
	public static By bookingdetail = By.xpath("//div[@class='card ng-star-inserted']");
	public static By home = By.xpath("//header/div[1]/div[1]/a[1]/img[1]");
	/*public static By location = By.xpath("//input[@id='search_places']");
	public static By locat = By.xpath("//span[contains(text(),'Bangalore Designers')]");
	public static By proceed = By.xpath("//span[contains(text(),'Proceed')]");
	public static By paynow = By.xpath("//div[contains(text(),'Pay now')]");
	public static By book = By.xpath("//span[contains(text(),'Book Now')]");
	public static By popup = By.xpath("//div[@id='modal']");
	*/
}
