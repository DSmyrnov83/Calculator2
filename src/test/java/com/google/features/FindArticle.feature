Feature: Find the article

  Scenario: Find the article by search
    Given website 'https://www.wikipedia.org' is opened
    When user enters 'Ukraine' into search field
    And clicks on search button
    Then the article about Ukraine is opened