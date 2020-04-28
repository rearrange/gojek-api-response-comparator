package com.gojek.stepdefs;

import com.gojek.ApacheHTTPClientGET;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class RunURLAndGetJSONResponse {

    private String inputURL;
    private Integer HTTPStatus;
    private String HTTPResponseHeader;
    private StringBuilder HTTPResponse;

    @Given("I have a URL input")
    public void i_have_url_input() {
        this.inputURL = "https://reqres.in/api/users/2";
    }

    @When("I send GET request to the URL")
    public void i_send_get_request_to_the_URL() throws IOException {
        ApacheHTTPClientGET appRequest = new ApacheHTTPClientGET();
        this.HTTPResponse = appRequest.fireGETRequest(inputURL);
        this.HTTPStatus = appRequest.returnHTTPStatus();
        this.HTTPResponseHeader = appRequest.returnContentType();
    }

    @Then("I should get response of HTTP status 200")
    public void i_should_get_http_status() {
        assert HTTPStatus == 200;
    }

    @Then("the response header I get should be a JSON")
    public void the_response_header_i_get_should_be_application_json() {
        assert HTTPResponseHeader.equals("application/json");
    }
}
