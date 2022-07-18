
@MESK-309
Feature: User should be able to login using valid credentials


@MESK-308
    Scenario: 1-Positive login scenario
      Given user is on the login page of web table
      When user enters user name "Employee33"
      And user enters password "Employee123"
      And user clicks to login
      Then verify that user can login
@MESK-351
  Scenario Outline: 2.1, 2.2 - user can not login with any invalid credentials
    Given user is on the login page of web table
    When user enters user name "<username>"
    And user enters password "<password>"
    And user clicks to login
    Then verify that user can not login and see the notice message

    Examples:
    |username    | password  |
    |dfhgjr456   | pfdkjh65  |
    |hdjstv      |vjvhfjn65  |
    |Employee33  |wrongpss   |
    |wrongUsName |Employee123|


Scenario: 2.3-user can not login with blank username
  Given user is on the login page of web table
  When user enters user name " "
  And user enters password "Employee123"
  Then Verify that user can not login with blank username and see the alert message


  Scenario: 2.4-user can not login with blank password
    Given user is on the login page of web table
    When user enters user name "Employee33"
    And user enters password " "
    Then Verify that user can not login with blank password and see the alert message
@MESK-355
  Scenario:3-user can see the password in a form of dots by default
    Given user is on the login page of web table
    When user enters user name "Employee33"
    And user enters password "Employee123"
    Then Verify that user can see the password in a form of dots by default

  @MESK-356
  Scenario: 4- User can see the password explicitly
    Given user is on the login page of web table
    When user enters user name "Employee33"
    And user enters password "Employee123"
    And click on the eye sign after entering the password
    Then verify that user can see the password explicitly

  @MESK-357
  Scenario: 5- User can see the "Forgot password?" link and the "Reset Password" button
    Given user is on the login page of web table
    Then verify that user can see the Forgot password? link
    And Click on the Forgot password? link
    Then Verify that user can see the Reset Password button

  @MESK-358
  Scenario: 6- User can see valid placeholders on Username and Password fields
    Given user is on the login page of web table
    Then Verify that user can see valid placeholders on Username inputbox
    Then Verify that user can see valid placeholders on Password inputbox