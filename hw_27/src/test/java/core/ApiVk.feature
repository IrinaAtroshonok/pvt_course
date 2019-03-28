Feature: Test api vk.com.

   @run
   Scenario: Posting on the wall
     Given I decided to post on the wall
      When I sent post request
      When I get response 
      Then I check is it posted
    
   @run
   Scenario: Update post on the wall
     Given I decided to update post on the wall
      When I sent update request
      When I get response
      Then I check json answer matches xml
      
   @run
   Scenario: Delete post on the wall
     Given I decided to delete post from the wall
      When I sent delete request
      When I get response
      Then I check json answer matches xml

 
