
Feature: user should be able to open sliders in home page


 @SuccessfullyOpenSliders
  @smoke
  Scenario: first slider is clickable
    When user click on the first slider
    Then product on first slider is displayed

  @SuccessfullyOpenSliders
  @smoke
  Scenario: second slider is clickable
    When user click on the second slider
    Then product on second slider is displayed