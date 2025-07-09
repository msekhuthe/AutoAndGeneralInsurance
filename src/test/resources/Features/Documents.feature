
Feature: Documents Feature

  Scenario: As a user I would like to request and view document history
    Given I am on the Documents Layout Page
    When I click on the Request Document button for Policy schedule
    Then I am redirected to the Policy schedule Page
    When I click on the Done button
    Then I am redirected to the Policy schedule confirmation Page
    When I click on the confirmation done button
    Then I am redirected to the Home Page


