Feature: local book

  @local
  Scenario Outline: selecting car in local
    Given URl opened with local
    Then click on local
     Then click from and enter valid address in "<from>" on local and click form
    And click on select on local
    And click on time on local
    And click on Select car on local
    Then if booking detail is shown in local redirect to home page

 Examples: 
      | from                   | 
      | Bangalore, Karnataka   | 

