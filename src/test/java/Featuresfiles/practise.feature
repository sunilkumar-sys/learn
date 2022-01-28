Feature: Searching for vegs in the search bar
@kart
  Scenario: Search for vegetables
    Given User is on greenkart website homepage
    When user enters vegetable name in the in search bar "Mushroom" and click on search button
    Then validate vegetable name after searching
@karts
  Scenario: Search for vegetables and add to cart
    Given User is on greenkart website homepage
    When user enters vegetable name in the in search bar "Tomato" and click on search button
    Then user increament the count and add prodcut to cart
    And click on cart button and click on payment checkout option
