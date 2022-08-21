package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features ={"src/test/resources/features"},
    glue = {"StepDefinition"},
    plugin ={"pretty"},
        monochrome = true
    )
public class TestRunner extends AbstractTestNGCucumberTests {
}
