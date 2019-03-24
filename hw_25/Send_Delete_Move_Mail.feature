Feature: Test with mails. Send, delete, move.
   
    @run
   Scenario: Send a mail
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I click a button New Mail
      When I fill the field To
      When I fill the field Topic
      When I fill content
      When I click a button Send 
      Then I check if mail is sended
    
      
  Scenario: Delete a mail
     Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I choose a mail
      When I click a button Delete 
      Then I check if mail is deleted

 
  Scenario: Moving letters to a new folder
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I choose a few mails 
      When I click move
      When I click button new folder
      When I fill the field folder name
      When I click button submit
      Then I see message that folder create