#autor:Jean
  @stories
  Feature: Utest Website
    As a user, I want to register on the Utest.com site
  @scenario1
  Scenario: Register on Utest
    Given :I enter the Utest site to register.
    When :I enter my data in the form
     |strFirstName|strLastName|strEmail            |strMonth   |strDay |strYear|strCity  |strPostal|strPassword|
     |Maria       |Lopez      |maria.solis@test.com|June       |10     |1996   |Ve       |507      |PasswordTest12|
    Then :I register my data and access the welcome page
    |strQuestion   |
    |Complete Setup|