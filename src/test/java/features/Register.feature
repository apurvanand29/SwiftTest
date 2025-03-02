Feature: User Registration
  Scenario: User is able to land login page
    Given User is on Home page
    When User clicks hamburger menu
    When User clicks on SignIn Portal
    Then User must be able to see Login page

  Scenario: User Lands on Registration page
    When User clicks Register Here button
    Then User must see User Registration Page

  Scenario: User Registers Successfully
    When User enters following on Registration page
    | Salutation | Ms.      |
    | First Name | Poppy    |
    | Last Name  | Pig      |
    | Email id   | pp@g.com |
    | Contact    | 9898989  |
    | Username   | pop      |
    | Password   | pop      |
    And User hits Submit button
    Then User must see User Registered Successfully

