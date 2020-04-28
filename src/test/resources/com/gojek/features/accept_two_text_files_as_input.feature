Feature: Accept two text files as input
  As a Gojek employee
  I want to provide two text files as input to the application
  So that the application can do comparison of the content later.

  Scenario Outline: Verify only text files are accepted as inputs
    Given I provide <file1> and <file2>
    When I feed the input to the application
    Then the input file reader validate the file <status>

    Examples: Different combinations of file types
      | file1   | file2   | status  |
      | "a.txt" | "b.txt" | true  |
      | "a.png" | "b.txt" | false |
      | "a.txt" | "b.mp3" | false |
      | "a.dat" | "b.gif" | false |