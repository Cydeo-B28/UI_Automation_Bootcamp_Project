package com.demoqa.step_definitions;

import com.demoqa.pages.ProgressBarPage;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarSteps {

    ProgressBarPage progressBar = new ProgressBarPage();

    @When("click startStopButton")
    public void click_start_stop_button() {
        progressBar.startStopButton.click();
    }

    @When("progress bar continue until value is {string}")
    public void progress_bar_continue_until_value_is(String value) {

    }

    @When("progressbar value is {string}")
    public void progressbarValueIs(String resetValue) {

    }
    @Then("verify button name is Reset")
    public void verifyButtonNameIsReset() {

    }
}
