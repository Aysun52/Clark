Feature:Dashboard Page
@wip
  Scenario: Access tab
    Given the user is on dashboard
    When the user press "Akzeptiren" in the iframe
    And the user on the "Clark" main page
    And the user on the "Privathaflicht" page

  Scenario:  Questinnaire
    When the user is on the 1st question
    And the user is on the 2nd question
    And the user is on the 3rd question
    And the user is on the 4th question