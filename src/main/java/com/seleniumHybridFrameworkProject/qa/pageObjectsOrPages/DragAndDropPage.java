package com.seleniumHybridFrameworkProject.qa.pageObjectsOrPages;

import com.seleniumHybridFrameworkProject.qa.utils.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

    WebDriver driver;
    Utilities utilities;

    public DragAndDropPage(WebDriver driver, Utilities utilities){
        this.driver = driver;
        this.utilities = utilities;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"column-a\"]")
    private WebElement elementHeaderA;

    @FindBy(xpath = "//*[@id=\"column-b\"]")
    private WebElement elementHeaderB;

    public void clickElementHeaderA(){
        elementHeaderA.click();
    }

    public void clickElementHeaderB(){
        elementHeaderB.click();
    }

}
