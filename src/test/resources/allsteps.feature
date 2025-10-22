Feature: User Registration, User login , User add to cart a product

  Scenario: user register
    Given user on registration page
    When user enters new user details
    Then user is Registered


  Scenario: user login successfully
    Given user open login page
    When user enters valid credentials
    Then user is logged in

  Scenario: Adding product from Catalog
    Given User is logged in
    When User navigates to the product page
    Then user add product to Cart