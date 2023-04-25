package com.demoqa.pages;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordianPage extends BasePage{

        public WebElement getAccordian(String number){
            String locator = "#section"+number+"Heading";
            return Driver.getDriver().findElement(By.cssSelector(locator));
        }



    }

