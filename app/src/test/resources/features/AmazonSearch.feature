@Amazon
Feature: Test Amazon search functionality

    @Cart
    Scenario Outline: As a customer, when I search for Alexa, I want to see if the third option is available for purchase and can be added to the cart with
        Given the user navigates to Amazon website
        And searches for <Product>
        And navigates to page number two
        And selects the third item
        Then the user is able to add it to the cart

        Examples:
            | Product     |
            | Alexa       |


