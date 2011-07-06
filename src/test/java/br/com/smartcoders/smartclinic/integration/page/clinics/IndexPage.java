package br.com.smartcoders.smartclinic.integration.page.clinics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {

	private WebElement newClinicLink;

	private WebDriver driver;

	public IndexPage(WebDriver driver) {
		this.driver = driver;
		this.driver.get("http://localhost:8080/smartclinic/clinics/");
		this.driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	}

	public NewPage goToNewClinicPage() {
		newClinicLink = driver.findElement(By.id("new"));
		newClinicLink.click();
		return new NewPage(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public boolean hasText(String text) {
		return driver.getPageSource().contains(text);
	}

}
