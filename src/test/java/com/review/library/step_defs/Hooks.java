package com.review.library.step_defs;

import com.review.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUpScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("Scenario's tags -> "+scenario.getSourceTagNames());
        System.out.println("Scenario's name -> "+scenario.getName());

        if(scenario.isFailed()){
           byte[] screenshot =  ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.embed(screenshot,"image/png",scenario.getName());
        }


        Driver.closeDriver();
    }
}
