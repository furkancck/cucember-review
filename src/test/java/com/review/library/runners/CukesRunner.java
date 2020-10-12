package com.review.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.review.library.step_defs",
        dryRun = false, tags = "@smoke"
)
public class CukesRunner {


}
