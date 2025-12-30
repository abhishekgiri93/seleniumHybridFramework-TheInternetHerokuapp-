package com.seleniumHybridFrameworkProject.qa.testcases;

import com.seleniumHybridFrameworkProject.qa.pageObjectsOrPages.DragAndDropPage;
import com.seleniumHybridFrameworkProject.qa.pageObjectsOrPages.MainHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropPageTC extends Base {

    WebDriver driver;
    DragAndDropPage dragAndDropPage;

    public DragAndDropPageTC(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        driver = initializeBrowserAndOpenApplicationUrl(prop.getProperty("browserName"));
        MainHomePage mainHomePage = new MainHomePage(driver, utilities);
        dragAndDropPage = mainHomePage.navigateToDragAndDropPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "verify Drag and Drop")
    public void verifyDragAndDrop(){
        driver.
    }
}
