package com.demoqa.pages;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordianPage extends BasePage{

    @FindBy(xpath = "//div[@class='card'][1]/div[2]")
    public WebElement aboutCollapse;


    public String selectAttributeOfClass() {

        return aboutCollapse.getAttribute("class");
    }
    }

