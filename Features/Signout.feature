Feature: signout app

  @SignOut
  Scenario Outline: signout application
    Given URl opened with signout
    Then Clicked on Sign in button in so
    Then Enter Valid "<email>" and "<Pwd>" in so
    And click one sign in button in so
    Then click on sign out in so
    And click on bookings and cancelled and comlplete and booknow
    Then click on img and accountsetting
    And click home 
    And click on img and signout
    And check sign out is done successfully
   


    Examples: 
      | email                   | Pwd   |
      | madheshmaddy080@gmail.com | madhesh@2001 |

 
