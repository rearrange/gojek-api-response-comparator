package com.gojek.stepdefs;

import com.gojek.APIResponseComparator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CompareTwoJSONResponsesTest {

    private String json1;
    private String json2;
    private Boolean answer;

    @Given("I have two JSON responses {string} and {string}")
    public void i_have_two_JSON(String json1, String json2) {
        this.json1 = json1;
        this.json2 = json2;
    }

    @When("I run the compare function")
    public void i_run_the_compare_function() {
        APIResponseComparator testCompare = new APIResponseComparator();
        answer = testCompare.compare(json1, json2);
    }

    @Then("the compare function tells me true")
    public void the_compare_function_tells_me_true() {
        assertTrue(answer);
    }

    @Then("the compare function tells me false")
    public void the_compare_function_tells_me_false() {
        assertFalse(answer);
    }

}
