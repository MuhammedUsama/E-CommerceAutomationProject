Feature: user should be able to login to the system

  @SuccessfullyLogin
  @smoke
  Scenario: user login with valid credentials
  Given user open login page
  When user enters valid username and password
  Then user could login successfully

