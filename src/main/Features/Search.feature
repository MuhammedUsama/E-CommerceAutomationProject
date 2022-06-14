Feature: user should be able to search for a product

  @SuccessfullySearchUsingName
  @smoke
  Scenario Outline: user search for a product using name
    When user search for a product with "<Proudct_Name>"
    Then product is found successfully
    Examples:
      | Proudct_Name |
      |  Apple        |


  @SuccessfullySearchUsingsku
  @smoke
  Scenario Outline: user search for a product using sku
    When user search for a product with "<Proudct_sku>"
    Then product is found successfully
    Examples:
      | Proudct_sku |
      |  AP_MBP_13   |
