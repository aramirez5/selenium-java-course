Feature: I can find a city inside a state

    Scenario Outline: As a Test Engineer, I try out different actions on a sandbox page
        Given I navegate to the list page
        When I search <state> in the list
        Then I can find <city> in the list

        Examples:
            | state      | city                |
            | Washington | Seattle, Washington |
            | Chicago    | Illinois, Chicago   |
