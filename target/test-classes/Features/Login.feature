Feature: Login screen

  Background: Launch website to validate login scenarios
    Given I go to the client side url

  Scenario: Successful login
    When Enter valid username
    And Enter valid password
    And Click on 'Login'
    Then Verify that user can login successfully

  Scenario: Leave password blank
    When Enter valid password
    And Leave password field blank
    And Click on 'Login'
    Then Verify that Message pops up saying 'Missing credentials'

  Scenario: Leave username blank
    When Leave email address blank
    And Enter valid password
    And Click on 'Login'
    Then Verify that Message pops up saying 'Missing credentials'

  Scenario: Enter invalid email
    When Enter valid username
    And Enter invalid password
    And Click on 'Login'
    Then Verify that Message pops up saying 'This password is not correct. Please use the below “Forgot your password” link to reset'
    
  Scenario: Enter valid password
    When Enter invalid username
    And Enter valid password
    Then Verify that Message pops up saying 'This password is not correct. Please use the below “Forgot your password” link to reset'
