Feature: Test filter.
   
    Scenario: Create filter
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I choose a mail
      When I click button more
      When I open popup for create new filter
      When I open all folders
      When I choose folder
      When I save Filter
      Then I see message that filter created
      
     
    Scenario: Delete filter
      Given I am on page with "https://mail.ru" url
      When I login as correct user
      When I click more in main menu
      When I open settings
      When I open filter settings
      When I click delete button
      When I confirm delete
      Then I see that filter deleted
