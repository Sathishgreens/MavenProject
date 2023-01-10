Feature: Checking Login Functionality

  Scenario Outline: 
    : Checking with invalid datas

    Given Facebook URL shoul be launched
    When User Enters "<UserName>" and "<Password>"
    When User Clicks Login Button
    Then Take Screenshot of result

    Examples: 
      | UserName | Password |
      |    12344 |    43535 |
