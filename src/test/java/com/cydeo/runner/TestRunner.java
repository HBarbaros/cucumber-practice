package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // "classpath:features"
        glue = "com/cydeo/step_definitions",
        dryRun = false, // for snippets must be true
        plugin = {
                "pretty" ,
                "html:target/cucumber.html",
                "me.jvt.cucumber.report.PrettyReports:target"
        },
        tags = "@hungry" //@hungry and not @smoke --> can also write
                         //@smoke and @hungry --> can also write
                         //@smoke or @hungry --> can also write

)

public class TestRunner {


}
