Feature: search fb data 

  Scenario: seacrhing in google
    Given open chrome browser 
    When  open google and enter "facebook"
    And click search button 
    Then  data must populate 
  
  Scenario: verify actors
  
  Given Connect with my Db 
  
  When 