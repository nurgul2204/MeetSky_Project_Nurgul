Feature: User should be able to login using valid credentials

  Background: user is on login page
    Given user is on the login page of web table

    Scenario: Positive login scenario
      When user enters user name "Employee33"
      And user enters password "Employee123"
      And user clicks to login
      Then verify that user can login

