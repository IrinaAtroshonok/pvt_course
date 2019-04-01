Feature: Test with flag

    Scenario: Flag letters
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I choose a few mails
      When I click button more
      When I flag letters
      Then I check whether the letters are flagged
      
    
    Scenario: Removing the flag from the letters
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I choose all mails
      When I click button more
      When I flag letters
      When I click button more
      When I remove the flag
      When I click button more
      Then I check if flag is not set