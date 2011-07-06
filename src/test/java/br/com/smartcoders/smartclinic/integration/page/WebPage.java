package br.com.smartcoders.smartclinic.integration.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage {
	protected final WebDriver driver;
	private WebElement field;
	
	public WebPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebPage andClickButton(String buttonName){
		List<WebElement> allButtons = driver.findElements(By.tagName("button"));
		for (WebElement button : allButtons) {
			if(button.getText().equalsIgnoreCase(buttonName)){
				button.click();
			}
		}
		return this;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public WebPage fillField(String fieldName) {
		field = driver.findElement(By.name(fieldName));
		return this;
	}

	public WebPage withValue(String value) {
		field.sendKeys(value);
		return this;
	}

	public boolean hasText(String text) {
		return false;
	}
}
