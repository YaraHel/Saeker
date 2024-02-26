Feature: Forgot Password

  Background: Launch website to validate login scenarios
    Given I go to the client side url

    Scenario: Click on forgot your password link
      When Click on "Forgot your password?"
      Then Forgot Password link displayed with Resend Password or Login buttons

    Scenario: Click on resend password
      When Click on "Forgot your password?"
      And Enter valid username
      And Click on "Resend password"
      #Then Verify that Message pops up saying 'Password reset link sent to your email address'
      Then verify that