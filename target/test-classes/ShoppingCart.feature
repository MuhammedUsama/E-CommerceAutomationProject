Feature: user should be able to add product to Shopping Cart

  @SuccessfullyAddProductToShoppingCart
  @smoke
  Scenario: user add a product to Shopping Cart
    When user add a product to Shopping Cart
    Then product is added successfully to Shopping Cart
