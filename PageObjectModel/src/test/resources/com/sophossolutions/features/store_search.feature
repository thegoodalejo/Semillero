#Author: alejandro.orozco@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I am in the page <url>
    When I look on <targetSearchBar> and <targetSearchButton> for <search> items <amount>
    Then I verify the <targetName> in the <targetContainer>

    Examples: 
      | search | amount | url                              | targetSearchBar                      | targetSearchButton                        | targetContainer                               | targetName                                |
      | pecera |      3 | https://www.amazon.com/          | //input[@id = 'twotabsearchtextbox'] | //input[@id = 'nav-search-submit-button'] | //div[contains(@class, 's-main-slot')]/div    | //span[contains(@class, 'a-text-normal')] |
      | pecera |      2 | https://es.aliexpress.com/       | //input[@name = 'SearchText']        | //input[@class= 'search-button']          | //div[@class= 'JIIxO']/div                    | //a[@title]/span                          |
      | pecera |      4 | https://www.mercadolibre.com.co/ | //input[@class= 'nav-search-input']  | //button[@type = 'submit']                | //ol[contains(@class, 'ui-search-layout')]/li | //h2[@class= 'ui-search-item__title']     |
