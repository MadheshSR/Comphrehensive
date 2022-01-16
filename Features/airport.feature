Feature: airport book

  @Airport
  Scenario Outline: selecting car in airport
  
   Given URl opened with airport
   Then click on airport
   Then click from and enter valid address in "<from>" on airport
    Then select pickAirport in dropdown
    And click on address in airport
    And enter valid  "<address>" in airport and click addresstype

    And click one select in airport
    And click on select car in airport
    Then if booking detail is displayed redirect to home page

   Examples: 
      | address            |   | from                   |     
      | Chennai       |   | Chennai, Tamil Nadu   |
 
