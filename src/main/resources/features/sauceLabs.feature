@SauceLabs
  Feature: Checking the functionalities of the SauceLabs pages
    Scenario: login into the page
      Given I open the browser
      When I open the saucelabs page
      Then login into the page with below credentials
        | userName      | passWord     |
        | standard_user | secret_sauce |
      And Handle the popup window
      Then Click on the Menu Option
      And Select the About option
      And Verify the launched page SauceLabs TryItFree
      Then Go to the products page
      And Select Price High to Low option
      Then Click the product to add the cart
      Then Verify the cart Page
      Then Click the Checkout page
      Then Enter the details
      And Verify the amount and checkout