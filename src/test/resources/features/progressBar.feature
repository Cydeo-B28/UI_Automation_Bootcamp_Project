Feature: Progress Bar Action

  @progressBar
  Scenario: progress bar actions
    Given Navigate to "progress-bar" page
    When click startStopButton
    And  progress bar continue until value is "50"
    When progressbar value is "100"
    Then verify button name is Reset