Feature: feature for google Search function

  Scenario: Check for Google is working or not
    Given brower is open
    And user on google search page
    When user enter text box
    And hit enter
    Then user navigate to the result
