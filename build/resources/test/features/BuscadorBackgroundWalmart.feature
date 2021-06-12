Feature: HU 003 BACKGOUND

  Background:
    Given que me encuentro en la pagina de walmart con la url https://www.walmart.com/



  Scenario: Buscar el producto en el buscador de walmart
    When busco un producto en el buscador walmart
      | nombreProducto |
      | Xbox Series X  |
    Then podre ver el producto buscado en la pantalla

  Scenario: Buscar el producto en el buscador de walmart
    When busco un producto en el buscador walmart
      | nombreProducto            |
      | Nike Tour Golf Hat, White |
    Then podre ver el producto buscado en la pantalla

