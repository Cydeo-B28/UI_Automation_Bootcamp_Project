@accordian
Feature: accordian actions on page

  Scenario: verify changing when click accordians
    Given Navigate to "accordian" page
    When click "2" accordion
    Then verify text is opened for "2"
    And  verify "2" text closed again

  # To_Do: Turn it into a Scenario Outline: verify changing when click accordians

