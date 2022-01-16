package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class SignoutUI {
	public static By signin = By.xpath("//span[contains(text(),'Sign In')]");
	public static By email = By.xpath("//input[@placeholder='Email']");
	public static By password =By.xpath("//input[@placeholder='Password']");
	public static By login = By.xpath("//span[contains(text(),'Login')]");
	public static By face=By.xpath("//header/div[1]/div[3]/div[1]/a[3]/img[1]");
	public static By bookings=By.xpath("//a[contains(text(),'Bookings')]");
	public static By cancelled=By.xpath("//div[contains(text(),'Cancelled')]");
	public static By completed=By.xpath("//div[contains(text(),'Completed')]");
	public static By booknow=By.xpath("//a[contains(text(),'Book Now!')]");
    public static By accountsetting=By.xpath("//a[contains(text(),'Account Settings')]");
    public static By home = By.xpath("//header/div[1]/div[1]/a[1]/img[1]");
    public static By logout=By.xpath("//a[contains(text(),'Log Out')]");
    public static By SignIn=By.xpath("//span[contains(text(),'Sign In')]");
}
