package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features ={"src/test/resources/features"},
    glue = {"StepDefinition","apphooks"},
    plugin ={"pretty", "html:results/html/cucumber.html",
    },
        monochrome = true
    )
public class TestRunner extends AbstractTestNGCucumberTests {
}
