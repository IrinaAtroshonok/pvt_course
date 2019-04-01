Feature: Test with astrological forecast

    Scenario: See the astrological forecast for the scorpion for the year
      Given I am on page with "https://mail.ru" url
      When I choose link astrology
      When I open page with all sign of the zodiac
      When I choose sign Scorpion
      When I choose astrology period
      Then I see astrological forecast
      
  