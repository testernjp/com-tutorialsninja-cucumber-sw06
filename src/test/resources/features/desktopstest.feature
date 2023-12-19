@regression
Feature: Desktop page test

  As a user I want to check desktop page and add product into cart

  Background: I am on homepage

  @author_NP @sanity @smoke @regression
  Scenario: Verify Product Arrange In Alphabetical Order
    When I mouse hover and click on desktop tab
    And I click on show all desktops
    And I click on sort by position
    And I select product sort by "Name (Z - A)"
    Then I should see product arrange in alphabetical order successfully

  @author_NP @smoke @regression
  Scenario Outline: Verify Product Added To Shopping Cart SuccessFully
    When I mouse hover and click on desktop tab
    And I select currency "£Pound Sterling"
    And I click on show all desktops
    And I select product sort by "Name (A - Z)"
    And I select product "<product>"
    Then Verify the Text "<product>" is displayed
    And I add quantity 1 for product using Select class.
    And I click on add to cart button
    And Verify the Message "Success: You have added “<product>” to your shopping cart!"
    And I click on shopping cart button
    Then I should see shopping cart text
    And Verify the Product name "<product>"
    And Verify the Model "<model>"
    And Verify the Total "<price>"
    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |