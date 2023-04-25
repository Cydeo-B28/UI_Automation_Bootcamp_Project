Feature: Slider Action

  @slider
  Scenario: Slider actions verifying
    Given Navigate to "slider" page
    When make some slider actions to "increase"
    Then verify slider value "increased"