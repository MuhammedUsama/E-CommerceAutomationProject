@SuccessfullyOpenLinks
Feature: user should be able to open Follow Us Links
  @smoke
  Scenario: user opens fb link
    When user click on fb link
    Then fb is opened

  @smoke
  Scenario: user opens twitter link
    When user click on twitter link
    Then twitter is opened


  @smoke
  Scenario: user opens youtube link
    When user click on youtube link
    Then youtube is opened

  @smoke
  Scenario: user opens rss link
    When user click on rss link
    Then rss is opened
