Feature:  User wants to proceed to checkout for a search item

  Scenario: User wants to search for a shirt and checkout as a registered user
    Given User is on the homepage of amazon site
    When User clicks on signin
    When User gives his email and password
    And User clicks on login
    Then User should login succesfully "Hello, krishna"
     And User searches for shirts
    And User clicks on search button
    And User clicks on selected shirt link "Charles Wilson Long Sleeve Plain Poplin Shirt"
    And User selects size and color of shirt
    And User adds the item to basket
    And when User clicks on proceed to checkout
    Then User should view the address page "Select a delivery address"
    And User navigates to home page
    And User should signoff



    Scenario: User wants to search for a shirt as a guest
      Given User is on the homepage of amazon site
      When User selects the the grocery departments Grocery
      And User clicks on the search button
      And user  selects choclate and sweets
      And User selects the choclate
      And User clicks on the selected ferrero
      And User adds the product to basket
      And User clicks proceed to checout
      Then User should view the login page

