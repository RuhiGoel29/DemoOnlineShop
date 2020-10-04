@Regression
Feature: Online shop Test Case

Background: 
Given DemoBlaze Web Page is opened

  @TC_01
  Scenario: Verify the amount is correctky displaying in Purchase detail
    When I click on "Laptops"
    And I click on "Sony vaio i5"
    And I click on "Add to cart"
    And I click on OK button in Alert popup
    And I click on Home button
    When I click on "Laptops"
    And I click on "Dell i7 8gb"
    And I click on "Add to cart"
    And I click on OK button in Alert popup
    And I click on "Cart"
    And I delete product "Dell i7 8gb" from cart
    And I click on "Place Order" button
    And I enter the name "Ruhi Goel"
    And I enter the country "India"
    And I enter the city "Delhi"
    And I enter the credit card "4444333322221111"
    And I enter the month "10"
    And I enter the Year "2020"
    And I click on "Purchase" button
    And I capture the Purchase ID
    And I capture the Amount
    Then I verify purchase amount is expected
    And I click on "OK" button
    


