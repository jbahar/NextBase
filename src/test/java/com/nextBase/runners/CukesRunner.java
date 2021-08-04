package com.nextBase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",// jason ==> javaScript object nation
                "rerun:target/rerun.txt"
        }, // plugin is to generate the report in target folder
        features = "src/test/resources/features",
        glue = "com/nextBase/step_definiton",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}

  // for the first time when we wanna make our snippet we need to make your dryRun to true
// but after when we wanna run our code, will make it to false