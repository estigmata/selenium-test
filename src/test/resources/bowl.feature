Feature: Bowl

  Scenario: a few cookies
    Given I have 42 cookies in my bowl
    When I wait 1 hour
    Then my bowl should be empty
