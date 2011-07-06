package br.com.smartcoders.smartclinic.integration.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;

public class newClinic extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/smartclinic/clinics/";
		Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
		selenium.start();
	}

	@Test
	public void testNewClinic() throws Exception {
		selenium.click("new");
		selenium.waitForPageToLoad("30000");
		selenium.type("clinic.name", "Clínica São Pedro");
		selenium.type("clinic.address", "Av. Pontes Vieira");
		selenium.click("css=button[type=submit]");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("Clínica São Pedro"));
		verifyTrue(selenium.isTextPresent("Av. Pontes Vieira"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
