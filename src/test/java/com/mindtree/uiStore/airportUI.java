package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class airportUI {

	   public static By airport = By.xpath("//span[contains(text(),'Airport')]");
	   public static By from = By.xpath("//input[@id='fromCityList']");
	   public static By desti =By.xpath("//span[contains(text(),'Chennai, Tamil Nadu')]");
	   public static By trip = By.xpath("//select[@formcontrolname='frmLocalSubTripType']");
	   public static By Address = By.xpath("//span[contains(text(),'Chennai Airport Domestic Terminal')]");
	   public static By droP = By.xpath("//input[@id='search_places']");
	   public static By select = By.xpath("//button[contains(text(),'Select Car')]");
		public static By selectcar= By.xpath("//button[contains(text(),'Select')]");
		public static By bookingdetail = By.xpath("//div[@class='card ng-star-inserted']");
		public static By home = By.xpath("//header/div[1]/div[1]/a[1]/img[1]");
}
