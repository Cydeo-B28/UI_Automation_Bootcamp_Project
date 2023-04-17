@accordian
Feature: accordian actions on page

  Scenario: verify changing when click accordians
    Given Navigate to "accordian" page
    When click "1" accordion
    Then verify text is opened
    And  verify "1" text closed again

  # To_Do: Turn it into a Scenario Outline: verify changing when click accordians

