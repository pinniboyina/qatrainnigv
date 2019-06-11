Feature:

  Background:
    Given I goto url as  "https://www.d3dsecurity.co.uk/register/"
    When  I click register button


  Scenario Outline:
    Given enter first name as "<firstname>"
    Given enter last name as "<lastname>"
    Given enter email id as "<email id>"
    Given enter password as “<password>”
    Given enter confirm password as "<conform password>"
    When click the "register button"

 Then I should see error message as "<error_message>"
    Then I should not see sign out button
    Then I should not see my "account button"

    Examples:

    | firstname        | lastname        | emailid                   |  password | confirm password |  Errormessage    |
    |                  | test laname     |  testkalyani@hotmail.com  | fun123    | fun123           | invalid firstname|
    |test firstname    |                 |  testkalyani@hotmail.com  |  fun123   |  fun123          |invalid lastname  |


  @sign_outline
    Scenario Outline:


    Given I goto url as  "<http://automationpractice.com/index.php>"
      When I click "<sign in button>"
      Given enter email id as "<email id>"
    Given enter password as "<password>"
    When click the "<signin button>" on sign in page
    Then I should see error message as "<error_message>"


    Examples:


              | emailid                       |  password   |   Errormessage          |
              |  testkalyani 1@hotmail.com    | fun123      |   authentication failed |
              |  testkalyani 2@hotmail.com    |  fun123     |   authentication failed |
              |   testkalyani 3@hotmail.com   |  fun123     |   authentication failed |



