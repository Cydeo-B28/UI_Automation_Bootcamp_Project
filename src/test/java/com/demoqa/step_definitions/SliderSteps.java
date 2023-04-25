package com.demoqa.step_definitions;

import com.demoqa.pages.SliderPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class SliderSteps {

    SliderPage sliderPage = new SliderPage();

    Actions actions = new Actions(Driver.getDriver());

    int sliderBarInitialValue;
    int sliderBarAfterValue;

    @When("make some slider actions to {string}")
    public void makeSomeSliderActionsTo(String input) {
        sliderBarInitialValue = Integer.parseInt(sliderPage.inputValue.getAttribute("value"));

        if(input.equalsIgnoreCase("increase")){
            actions.dragAndDropBy(sliderPage.sliderInput, 20,0).perform();
        }else if(input.equalsIgnoreCase("decrease")){
            actions.dragAndDropBy(sliderPage.sliderInput, -20,0).perform();
        }else{
            System.out.println("wrong input");
        }
    }

    @Then("verify slider value {string}")
    public void verifySliderValue(String outcome) {

        sliderBarAfterValue = Integer.valueOf(sliderPage.inputValue.getAttribute("value")); // Java do casting for from Integer to int
        System.out.println("sliderBarAfterValue = " + sliderBarAfterValue);

        if(outcome.equalsIgnoreCase("increased")){
            Assert.assertTrue(sliderBarAfterValue > sliderBarInitialValue);
        }else if(outcome.equalsIgnoreCase("decreased")){
            Assert.assertTrue(sliderBarInitialValue > sliderBarAfterValue );
        }else{
            System.out.println("wrong output");
        }

    }
}
