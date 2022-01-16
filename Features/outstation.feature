Feature: Outstation book

  @outstation
  Scenario Outline: selecting car in outstation
    Given URl opened with outstation
    Then click from and enter valid address in "<from>" on out
    Then click to and enter valid address in "<to>" on out and click
    And click on select on out
    Then if car page is displayed in out redirect to home page

    Examples: 
      | from                   | to   |
      | Bangalore, Karnataka   | Chennai Central, Chennai |
