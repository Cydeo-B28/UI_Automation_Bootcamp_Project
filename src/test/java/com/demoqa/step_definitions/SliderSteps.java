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
    @When("make some slider actions")
    public void make_some_slider_actions() {

        actions.dragAndDropBy(sliderPage.sliderInput, 20,0).perform();


    }

    @Then("verify you make correct")
    public void verify_you_make_correct() {

        String sliderBarValue = sliderPage.inputValue.getAttribute("value");

        System.out.println("sliderBarValue = " + sliderBarValue);

    }
}
