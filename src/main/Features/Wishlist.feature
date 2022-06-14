Feature: user should be able to add product to wishlist

  @SuccessfullyAddProductToWishlist
  @smoke
  Scenario: user add a product to wishlist
    When user add a product to wishlist
    Then product is added successfully to wishlist
