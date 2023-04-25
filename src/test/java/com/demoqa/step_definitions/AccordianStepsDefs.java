package com.demoqa.step_definitions;

import com.demoqa.pages.AccordianPage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccordianStepsDefs {

    AccordianPage accordianPage= new AccordianPage();
    public String baseUrl= ConfigurationReader.getProperty("baseUrl");
    @Given("Navigate to {string} page")
    public void navigate_to_page(String path) {
        Driver.getDriver().get(baseUrl+path);
    }
    @When("click {string} accordion")
    public void click_accordion(String number) {

        // create a method that will take number as parameter and will return WebElement to click

    }
    @Then("verify text is opened for {string}")
    public void verify_text_is_opened() {


    }

    @And("verify {string} text closed again")
    public void verifyTextClosedAgain(String number) {


    }
}
