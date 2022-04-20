Feature: Search Action on Home Page

  Scenario: Do a valid search with single keyword
    Given I am on the homepage of "https://www.amazon.com/" to do a single keyword search
    When I do a single keyword search for "iphone13"
    Then Click on search button
    And I see product list page







