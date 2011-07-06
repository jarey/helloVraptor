package br.com.smartcoders.smartclinic.integration.page.clinics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewPage {
	
	private WebElement clinicName;
	private WebElement clinicAddress;
	private WebElement saveButton;
	
	private WebDriver driver;
	
	public NewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillInName(String name){
		clinicName = driver.findElement(By.name("clinic.name"));
		clinicName.clear();
		clinicName.sendKeys(name);
	}
	
	public void fillInAddress(String address){
		clinicAddress = driver.findElement(By.name("clinic.address"));
		clinicAddress.clear();
		clinicAddress.sendKeys(address);
	}
	
	public IndexPage saveClinic() {
		saveButton = driver.findElement(By.id("saveButton"));
		saveButton.submit();
		return new IndexPage(driver);
	}

}
