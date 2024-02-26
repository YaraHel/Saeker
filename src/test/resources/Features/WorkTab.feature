Feature: Work Tab

  Background: Launch website to validate work tab scenarios
    Given I go to the client side url
    When Enter valid username
    And Enter valid password
    And Click on 'Login'
    And Verify that user can login successfully
    And Click on "My Work Tab"

  Scenario: Verify userName's dashboard
    Then Page loads with user's name followed by dashboard

  Scenario: Verify Location dropdown list
    
    