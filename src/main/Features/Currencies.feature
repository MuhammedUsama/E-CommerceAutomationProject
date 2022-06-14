Feature: user should be able to switch between currencies

  @SuccessfullySwitchCurrency
  @smoke
  Scenario: user switch currency
    When user change currency
    Then currency switches successfully

