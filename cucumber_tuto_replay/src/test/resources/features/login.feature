Feature: login to test project
#@smoketest
  Scenario Outline: login to test project
    Given I m in the login page
    When i type "<username>" and "<password>"
    And i click on the "<button>" 
    Then I verify i am in the welcome page

    Examples: 
      | username  | password |button |
      | name1 |     12345 |submit |
      #| name2 |     pass2 |submit |
