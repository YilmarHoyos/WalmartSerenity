Feature: HU-002 Buscador aleatorio Walmart

  Scenario Outline: <Escenario>

    Given que me encuentro en la pagina de walmart con la url <Url>
    When busco un producto aleatorio en el buscador
    Then podre ver el producto aleatorio buscado

    Examples:
      | Escenario                                      | Url                      |
      | Buscar palabra en  buscador de Walmart exitoso | https://www.walmart.com/ |
