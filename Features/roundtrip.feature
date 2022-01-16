Feature: roundtrip book

  @roundtrip
  Scenario Outline: selecting car in roundtrip
    Given URl opened with roundtrip
    Then click on roundtrip
     Then click from and enter valid address in "<from>" on round
    Then click to and enter valid address in "<to>" on round and click
    And click one select on round
    And click on select car on round
    Then if car page is displayed in round redirect to home page

  Examples: 
      | from                   | to   |
      | Bangalore, Karnataka   | Chennai Central, Chennai |
