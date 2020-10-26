Feature: purchase process
  I want to make a purchase

  Scenario: Add product to shopping cart
    Given  the user searches a product
      | name                           | quantity |
      | Papa Amarilla Huamantanga x kg |          |
    When   the user adds a product to the shopping cart
      | name                           | quantity |
      | Papa Amarilla Huamantanga x kg | 3        |
    Then   the user sees added product
      | name                           | quantity |
      | Papa Amarilla Huamantanga x kg |          |
