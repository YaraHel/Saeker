Feature: Work Tab

  Background: Launch website to validate work tab scenarios
    Given I go to the client side url
    When Enter valid username
    And Enter valid password
    And Click on 'Login'
    And Verify that user can login successfully
    And Click on "My Work"

  Scenario: Verify userName's dashboard
    Then Page loads with user's name followed by dashboard

  Scenario: Verify Location dropdown list
    And Click on "All locations"
    Then Verify location option

  Scenario: Verify Search option in Location dropdown list
    And Click on "All locations"
    Then Verify search option inside location dropdown list

  Scenario: Verify user can scroll down inside location dropdown
    And Click on "All locations"
    Then Verify user can scroll down inside location dropdown
    
    