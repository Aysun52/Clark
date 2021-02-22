Feature:Dashboard Page
@wip
  Scenario: Access tab
    Given the user is on dashboard
    When the user navigates to "Angebote"
    Then the user insurance category displays
