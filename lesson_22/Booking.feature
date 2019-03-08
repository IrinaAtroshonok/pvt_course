Feature: Test1 booking page
   @run
    Scenario: Check if there any hotels
      Given I am on page with "https://www.booking.com" url
      When I enter the city
      When I choose dates
      When I choose the number of guests
      When I choose the number of rooms
      When I click button Find
      Then I check if there are hotels
      
