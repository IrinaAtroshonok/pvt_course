Feature: Test2 booking page
   
    Scenario: Check hotel rating
      Given I am on page with "https://www.booking.com" url
      When I enter the city
      When I choose dates
      When I choose the number of guests
      When I choose the number of rooms
      When I click button Find
      When I sorted hotels by rating
      When I open the first hotel
      Then I check hotel rating