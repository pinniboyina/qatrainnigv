Feature: sign in

  Background:
    Given I goto url as  "https://www.d3dsecurity.co.uk/register/"
    When  I click register button

@registration
  Scenario: submit with all valid fields

    Given enter first name as "Kalyani"
    Given enter last name as "Abhi"
    Given enter email id as "testkalyani@hotmail.com"
    Given enter password as “fun123”
    Given confirm pass word “fun123”
    When I click "register button"
    Then I should see my "account button"
    Then I should see "logout button"
    Then I should see "firstname" as header

    Then I should not see "signin button"

  @contact
  Scenario: CUSTOMER SERVICE
    Given I goto url as  "https://www.d3dsecurity.co.uk/contactus/"
    When  I click "contact us"  button
    Given enter first name as "Kalyani"

    Given enter last name as "Abhi"

    Given enter email id as "testkalyani@hotmail.com"
    Given phone number as "12345678695"
    And I enter subject as "order"
    And I enter message as "please help me with my order"
    When I click send button
    Then I should see message "Thank you for your Inquiry,we will contact you soon"

    @freeQuote
    Scenario:
    Given I goto url as  "https://www.d3dsecurity.co.uk/contactus/"
    When  I click "online demo"  button
    Given enter first name as "Kalyani"
    Given enter last name as "Abhi"

    Given enter email id as "testkalyani@hotmail.com"
    Given phone number as "12345678695"
    And I enter subject as "order"
    And I enter message as "please send me a quote for security system"
    And I enter capatcha code as "KJs9"
    When I click "send button"
#    Then I should seez message "Thank you for your Inquiry,we will contact you soon"








