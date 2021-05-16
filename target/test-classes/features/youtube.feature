Feature: search functionality

  Scenario: searching something

    Given as a user I open the youtube
    When I search "herkulnagme"
    Then I should be able to see the "HerkulNagme" channel on page
