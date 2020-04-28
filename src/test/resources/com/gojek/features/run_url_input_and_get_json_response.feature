Feature: Run URL given and get JSON response
  As a Gojek employee
  I want to run URL inputs as GET request
  So that I can get the JSON responses

  Scenario: Check that URL GET request is successful
    Given I have a URL input
    When I send GET request to the URL
    Then I should get response of HTTP status 200

  Scenario: Check that URL GET request return a JSON response
    Given I have a URL input
    When I send GET request to the URL
    Then the response header I get should be a JSON