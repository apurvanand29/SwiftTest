@login
Feature: User login
  Scenario: User is able to land login page
    Given User is on Home page
    When User clicks hamburger menu
    When User clicks on SignIn Portal
    Then User must be able to see Login page

    When User enters username "pop"
    And User enters password "pop"
    And User hits Login button
    Then User must see "ShoeTypes.html" url