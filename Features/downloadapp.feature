Feature: download app 

  @downloadapp
  Scenario Outline: verify download app
    Given URl opened with download app
    Then click on download app
    Then if download app titile is verified redirect to home page

  
 
