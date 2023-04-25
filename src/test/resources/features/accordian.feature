Feature: accordian actions on page

  Scenario: verify changing when click accordians
    Given Navigate to "accordian" page
    When click "2" accordion
    Then verify class text is "open" for "2"
    When click "2" accordion
    Then verify class text is "close" for "2"


  # To_Do: Turn it into a Scenario Outline: verify changing when click accordians

  @accordian
  Scenario Outline: verify different accordian actions
    Given Navigate to "accordian" page
    When click "<number>" accordion
    Then verify class text is "open" for "<number>"
    When click "<number>" accordion
    Then verify class text is "close" for "<number>"
    Examples:
      | number |
      | 2      |
      | 3      |
      | 1      |
