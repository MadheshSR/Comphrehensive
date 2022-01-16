Feature: Validate Page

 @validpage
 Scenario Outline: validate the page title
  Given Open  Website with URl
   Then check whether the  tiltle is verified "<title>" 
   Examples:
   
    |title                                                                              |
    |Book Outstation Cabs, Local & Airport Taxi Service - India's Leading Car Rentals   |