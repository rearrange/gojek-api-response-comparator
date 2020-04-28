package com.gojek;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty",
                           "json:target/cucumber-reports/CucumberTestReport.json",
                           "rerun:target/cucumber-reports/rerun.txt"},
                 features = "src/test/resources/com/gojek/features",
                 glue = "com.gojek.stepdefs")

public class RunCucumberTest extends AbstractTestNGCucumberTests{
}
