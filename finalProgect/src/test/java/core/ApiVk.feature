Feature: Test api vk.com.
  
   Scenario: Posting on the wall
     Given I decided to post on the wall
      When I sent post request
      When I get response 
      Then I check is it posted
    
   
   Scenario: Update post on the wall
     Given I decided to update post on the wall
      When I sent update request
      When I get response
      Then I check json answer matches xml


 
