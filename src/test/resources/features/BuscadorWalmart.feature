#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: HU-001 Buscador Walmart
  Yo como usuario de walmart, quiero ir al buscador y buscar
  unos productos, despues de ello seleccionarlos y obesrvar si
  los productos fueron seleccionados correctamente



  #Scenario: Buscar palabras en la zona de busqueda exitoso
    #Given I want to write a step with precondition --> dado
    #When I complete action  --> cuando
    #Then I validate the outcomes --> entonces

  Scenario Outline: <Escenario> <Producto>
    Given que me encuentro en la pagina de walmart con la url <Url>
    When busco diferentes productos <Producto> en el buscador
    Then podre ver los productos <Producto> buscados

    Examples:
      | Escenario                                        | Producto                                                              | Url                      |
      | Buscar palabra en el buscador de Walmart exitoso | Harry Potter Hard Cover Boxed Set: Books #1-7                         | https://www.walmart.com/ |
      | Buscar palabra en el buscador de Walmart exitoso | Xbox Series X                                                         | https://www.walmart.com/ |
      | Buscar palabra en el buscador de Walmart exitoso | Sony Playstation 4 DualShock 4 Controller, Black                      | https://www.walmart.com/ |
      | Buscar palabra en el buscador de Walmart exitoso | adidas Moves Eau de Toilette Cologne for Men, 1 Oz Mini & Travel Size | https://www.walmart.com/ |
      | Buscar palabra en el buscador de Walmart exitoso | Nike Tour Golf Hat, White                                             | https://www.walmart.com/ |
