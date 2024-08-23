Feature:Login and actions in Selenium
  @test
  Scenario: Write code to login and perform actions
    Given a user has credentials to login to an application
    When popup is displayed , user is logged in successfully
    Then click on the hyperlink
    And perform drag and drop operations
    Then use the navigate commands
    And handle an alert