package br.com.smartcoders.smartclinic.integration.steps.clinics;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.smartcoders.smartclinic.integration.page.clinics.IndexPage;
import br.com.smartcoders.smartclinic.integration.page.clinics.NewPage;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.spring.StepDefinitions;

@StepDefinitions
public class CreateNewClinicSteps {
	
	private WebDriver driver;
	private IndexPage indexPage;
	private NewPage newPage;
	
	@Autowired
	public CreateNewClinicSteps(WebDriver driver) {
		this.driver = driver;
		System.out.println(driver.getClass());
	}
	
	@Given("^that I am at \"([^\"]*)\" page$")
	public void thatIAmAtPage(String title) {
		indexPage = new IndexPage(driver);
		Assert.assertEquals(title, indexPage.getTitle());
	}
	
	@Given("^I click at new$")
	public void iClickAtNew() {
		newPage = indexPage.goToNewClinicPage();
	}

	@Given("^I click at save$")
	public void iClickAtSave() {
		indexPage = newPage.saveClinic();
	}

	@Given("^I fill in \"clinic.name\" with \"([^\"]*)\"$")
	public void iFillInNameWithValue(String value) {
		newPage.fillInName(value);
	}

	@Given("^I fill in \"clinic.address\" with \"([^\"]*)\"$")
	public void iFillInAddressWithValue(String value) {
		newPage.fillInAddress(value);
	}

	@Then("^I should be at \"([^\"]*)\" page$")
	public void iShouldBeAt(String title) {
		Assert.assertEquals(title, indexPage.getTitle());
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void iShouldSeeText(String text) {
		Assert.assertTrue(indexPage.hasText(text));
	}
	
}
