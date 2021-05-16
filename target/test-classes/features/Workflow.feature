Feature:workflow

  Scenario: Leave approval

    Given as a user I login nextbasecrm
    And I navigate to the leave approval page
    When I input the valid credential
    Then I should be able to sent
