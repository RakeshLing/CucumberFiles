Feature:To launch the facebook page

  Scenario: To use facebook page
    Given To launch the chromebrowser and window maximize
    When To launch the url facebook page
    And To enter the mail
    And To enter the password
    And To login the button
    Then To close browser
    
    
    Scenario Outline:To use user facebook page
    Given To launch the user chromebrowser and window maximize
    When To launch the user url facebook page
    And To enter the user data "<emaildatas>" in mail
    And To enter the user data "<passworddatas>" in password
    And User login the button
    Then To close browser
    
Examples:
  |emaildatas|    |passworddatas|
  |Rakeshl|       |Lingam1|
  |Yogeshk|       |SuperY1|
  |Raveshj|       |krishna|
  |Ponnish|       |Deepika|
  |Rakeshj|       |Lingam2|