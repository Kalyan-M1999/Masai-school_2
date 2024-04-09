@tag
Feature: Simple From

  @Smoke
  Scenario: To validate textbox functionalities
    Given User open a chrome browser and enter a url 
    When User enters firstname, lastname, Email, contact number, message 
    And User clicks on submit button
    Then A pop alert should be displayed 
    And user clicks on alertbox
    