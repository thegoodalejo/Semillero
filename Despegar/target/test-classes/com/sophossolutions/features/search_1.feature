#Author: juan.ugarriza@sophossolutions.com

Feature: Find cheapest flights on despegar.com.co
  As an automator I want to automate the search of cheap flights on despegar.com.co

  
  Scenario Outline: <Search>
    Given Search main page of the website <Url>
    When Input <Origin> as origin and <Destination> as destination
    And Input <DepartureDate> as departure date and <ReturnDate> as return date
    And Select 2 adults and 2 children with ages
      |   6  |
      |   9  |
    Then Print cheapest flight from each airline in the console
    
    Examples:
    	|           Search           |            Url              |   Origin   |  Destination   | DepartureDate |  ReturnDate  |
    	| Search flights on Despegar | https://www.despegar.com.co | "medellin" | "barranquilla" |  "1/08/2021" | "6/09/2021" |