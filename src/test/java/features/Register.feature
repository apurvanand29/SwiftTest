Feature: User Registration
  Scenario: User is able to land login page
    Given User is on Home page
    When User clicks hamburger menu
    When User clicks on SignIn Portal
    Then User must be able to see Login page

  Scenario: User Lands on Registration page
    When User clicks Register Here button
    Then User must see User Registration Page

