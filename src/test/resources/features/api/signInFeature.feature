@tc01
Feature: Add summer dress to cart


  Scenario: When summer dress added to cart, Sign In option available
    Given Access the application via URL
    When Navigate to Summer Dress
    Then The selected dress added to the cart
    Then Proceed to Checkout
    Then Sign In page is accessible
