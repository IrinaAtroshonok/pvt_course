Feature: Work with spam on mail.ru 
   
   Scenario: Put mail into spam
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I choose a mail
      When I click a button Spam 
      Then I check if mail is in spam
      
     
   Scenario: Extract mail from spam
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I open1 spam folder
      When I choose a mail in spam
      When I click a button NOT Spam 
      Then I check if mail is not in spam