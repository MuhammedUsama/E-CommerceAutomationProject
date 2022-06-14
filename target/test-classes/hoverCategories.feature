Feature: user should be able to hover and select different categories

  @SuccessfullyHoverAndSelectCategory
  @smoke
  Scenario: user Select Category
    When user hover and select category
    Then category changes successfully

