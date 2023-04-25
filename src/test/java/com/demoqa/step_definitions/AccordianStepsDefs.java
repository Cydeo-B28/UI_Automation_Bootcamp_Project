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
    public void click_accordion(String number) throws InterruptedException {

        accordianPage.getAccordian(number).click();
        Thread.sleep(1000);

    }



    @Then("verify class text is {string} for {string}")
    public void verifyClassTextIsFor(String stateOfAccordian, String number) {
        String collapsedInfo = accordianPage.getCollapsedInfoForAccordian(number).getAttribute("class");

        System.out.println("collapsedInfo = " + collapsedInfo);

        if(stateOfAccordian.equalsIgnoreCase("open")){
            Assert.assertEquals("collapse show",collapsedInfo);
        }else if(stateOfAccordian.equalsIgnoreCase("close")){
            Assert.assertEquals("collapse",collapsedInfo);
        }else {
            System.out.println("Undefined Status");
        }
    }
}
