@SmokeTest

  Feature: Validate user profile information

  Scenario: Log in to system and change Profile name, surname and birth date
    Given Start google chrome
    And Opens forum cinema login page
    And Maxime chrome window
    And Fill username input pnpudglpjptruoqdws@miucce.com and password test1234
    And Press login button
    When Opens user information panel
    And Change users Name to AAAAA
    And Change users Surname to BBBBB
    And Change users Birth date to 11
    And Change users Birth month Novembris
    And Change user Birth year 1991
    And Scroll webpage down
    Then Save the new information
#   And Close Chrome