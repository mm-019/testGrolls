Feature: Shopping
  In order to get a new shirt that fits I want to select correct size. 



  Scenario: Add a shirt to shopping cart
    Given I have opened the website
    And I have selected size XL in drop-down list
    When I press Add to cart
    Then There should be 1 object in cart
    

