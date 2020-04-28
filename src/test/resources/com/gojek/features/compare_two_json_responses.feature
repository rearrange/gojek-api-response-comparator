Feature: Compare two JSON responses
  As a Gojek employee
  I want to compare two JSON responses
  So I can determine whether two JSON responses are similar

  Scenario Outline: Verify two JSON responses compare correctly
    Given I have two JSON responses <json1> and <json2>
    When I run the compare function
    Then the compare function tells me <equality>
    Examples:
      | json1          | json2          | equality |
      | "{foo: 'bar'}" | "{foo: 'bar'}" | true     |
      | "{bar: 'foo'}" | "{foo: 'bar'}" | false    |

