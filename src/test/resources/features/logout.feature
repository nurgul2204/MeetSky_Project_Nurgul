Feature: As a user, I should be able to log out

  Scenario: 1-User can log out and ends up in log in page
    Given user is on the login page of web table
    When user enters user name "Employee33"
    And user enters password "Employee123"
    And user clicks to login
    Then verify that user can login
    And Click on the profile icon
    Then Verify that user can see the Logout link
    And Click on the Log out link
    Then Verify that user can log out on the files page and see login page


  @wip
  Scenario: 2-User can not go to the home page again by clicking the step back button after successfully logging out
    Given user is on the login page of web table
    When user enters user name "Employee33"
    And user enters password "Employee123"
    And user clicks to login
    Then verify that user can login
    And Click on the profile icon
    Then Verify that user can see the Logout link
    And Click on the Log out link
    Then Verify that user can log out on the files page and see login page
    And Click on the step back button
    Then Verify that user can NOT go to home page again