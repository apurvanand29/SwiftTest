Feature: User login
  Scenario: User is able to land login page
    Given User is on Landing page
    When User clicks hamburger menu
    When User clicks on SignIn Portal
    Then User must be able to see Login page