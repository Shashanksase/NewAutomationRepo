Feature: Search feature of tricentice application

  Scenario: Verify Search  scenario
    Given User is on Homepage 
    When User  search BMW 
    Then New window should open with search results

    Scenario: Verify Search  result
    Given Search result available 
    When user click on  first result 
    Then Details should dispaced