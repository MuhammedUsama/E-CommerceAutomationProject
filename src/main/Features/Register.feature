Feature: user should be able to Register to the system

  @SuccessfullyRegister
  Scenario: user Registration
    Given user open registration
    When user enters valid registrations data
    Then user could register successfully
