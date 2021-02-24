Feature:Dashboard Page
@wip
  Scenario: Access tab
    Given the user is on dashboard
    When the user press "Akzeptiren" in the iframe
    And the user on the "Clark" main page
    And the user on the "Privathaflicht" page

    When the user  click on "Loslegen" button
    When the user is on the 1st question
    And the user is on the 2nd question
    And the user is on the 3rd question
    And the user is on the 4th question

    Then the user press "Angeboteanfordern"
    And verify that user should see "Dein Angebote ist da!"


    When click on "Zum Angebote"
    Then the user see "Deine Angebote zur Privathaftplicht"  page for recommended insurances

    When the user press on recommended insurance "Jetzt abschliessen" button
    And the user enters "dummydummy767@gmail.com" and "Clark123132" follow by registration

  Scenario: Registration Page
    When the user select gender on registration info page
    And the user input "<firstName>" "<lastName>" "<street>" "<houseNumber>" "<zipCode>" "<city>" "<birthDate>" "<telephoneNumber>"
      | firstName | lastName | street           | houseNumber | zipCode | city      | birthDate  | telephoneNumber |
      | Helen    | Yolk     | Frankfurt Street |8            | 60306   | Frankfurt |05/09/1990  |015229320777     |

    Then the user click on "Weiter" button





