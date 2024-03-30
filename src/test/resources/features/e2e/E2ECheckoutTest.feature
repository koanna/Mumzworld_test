Feature: E2E Checkout test

  Background:
    Given a customer is on the mumzworld webstore main page

  @checkout-1
  Scenario: A new customer attempts checkout with registration
    And customer searches for ''
    And customer adds '' to the bag
    And customer goes to shopping cart
    And customer sets the quantity of '' item in the cart to ''
    When customer clicks on Proceed to checkout button
    Then customer is shown a new user registration page
    And customer fills the new user registration page
    When customer clicks on Continue button
    Then customer is shown a registration success message

