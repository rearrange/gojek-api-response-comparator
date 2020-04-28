package com.gojek.stepdefs;

import com.gojek.FileInputData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AcceptTwoTxtFilesAsInput {
    private String firstFile, secondFile;
    private boolean validFiles;

    @Given("I provide {string} and {string}")
    public void i_provide_file1_and_file2(String fileName1, String fileName2) {
        this.firstFile = fileName1;
        this.secondFile = fileName2;
    }

    @When("I feed the input to the application")
    public void i_feed_the_input_to_the_application() {
        FileInputData input = new FileInputData(firstFile, secondFile);
        validFiles = input.isValidInput();
    }

    @Then("the input file reader validate the file true")
    public void the_input_file_reader_validate_the_file_true() {
        assertTrue(validFiles);
    }

    @Then("the input file reader validate the file false")
    public void the_input_file_reader_validate_the_file_false() {
        assertFalse(validFiles);
    }

}
