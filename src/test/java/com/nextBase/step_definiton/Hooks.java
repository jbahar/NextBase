package com.nextBase.step_definiton;

import com.nextBase.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before (value = "@login", order = 1)
    public void setupLoginScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @Before ("@db")
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario){  //===> we need to import the Scenario which import from cucumber java

        //if my scenario fail  then take the screenshot
       // scenario.isFailed();  // ==> if scenario fail it will return true

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        System.out.println("--Teardown steps are being applied...");
       // Driver.closeDriver();

    }

    @BeforeStep
    public void setupStep(){
        System.out.println("----setup applying for each step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("----teardown applying for each step");
    }

}
