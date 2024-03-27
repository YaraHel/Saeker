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
    #add search step

  Scenario: Verify user can scroll down inside location dropdown
    And Click on "All locations"
    Then Verify user can scroll down inside location dropdown

  Scenario: Verify i information icon
    And Click on "I Icon"
    Then Verify that Message pops up saying "The compliance and efficiency wheels show live compliance of tasks and actions currently in view on the screen. Compliance will be affected if the most recent occurrence has been missed and is currently overdue, or if the task is missing a required document that is overdue. Efficiency will be affected if the most recent occurrence was completed but was either completed late or a document was added late or if compliance is affected."

  Scenario: Verify Overall Compliance and Efficiency Wheels
    Then Verify titles and percentages

  Scenario: Verify Arrow Functionality
    And Click on "Mid Arrow"
    Then The rings and location drop down should collaps
    And Display all the activity summary boxes
    When Click on "Mid Arrow"
    Then The rings and location drop down should visible

  Scenario: Verify Only show tasks missing documents
    And Click on "Only show tasks missing documents"
    Then boxes are filtered to only display tasks that are missing documents
    When Click on "Only show tasks missing documents"
    Then Display all the activity summary boxes

  Scenario: Verify dropdown after clicking on Active option
    And Click on "ActiveInternal"
    Then Verify dropdown options
    When Click on "ActiveExternal"
    Then Verify dropdown options
    When Click on "ActiveActions"
    Then Verify dropdown options

  Scenario: Verify percentages of first three tasks


