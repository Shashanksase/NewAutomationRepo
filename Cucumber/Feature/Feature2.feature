Feature: Tricentis Login Feature

  @tag2
  Scenario Outline: test Login Feature multiple data
    Given User is on Login page
    When User enters <username> and <password> on login page
    Then Homepage should displayed

    Examples: 
      | username | password     |
      | Shashank | password*12  |
      | Sudhir   | password&234 |
