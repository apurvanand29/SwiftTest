Feature: User login
  Scenario: User is able to land login page
    Given User is on Landing page
    When User clicks hamburger menu
    When User clicks on SignIn Portal
    Then User must be able to see Login page

  Scenario: User logins and land on Product Category page
    Given User is on Login page
    When User enters username "pop"
    And User enters password "pop"
    And User clicks Login button
    Then User is on Product Category page