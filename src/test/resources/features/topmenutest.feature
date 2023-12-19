@regression
Feature: Verify user should navigate to the pages successfully


Feature: Verify user should navigate to the pages successfully

  @author_NP @sanity @regression
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on the homepage
    And I hover on the Desktops tab and click
    And call selectMenu method and pass the menu "Show AllDesktops"
    Then I can see the text 'Desktops'

  @author_NP @smoke @regression
  Scenario: Verify user should navigate to LaptopsAndNotebooks page successfully
    Given I am on the homepage
    And I hover on the Laptops & Notebooks tab and click
    And call selectMenu method and pass the menu "Show AllLaptops & Notebooks"
    Then I can see the text 'Laptops & Notebooks'

  @author_NP @regression
  Scenario: Verify user should navigate to Components page successfully
    Given I am on the homepage
    And I hover on the Components tab and click
    And call selectMenu method and pass the menu "Show AllComponents"
    Then I can see the text 'Components'