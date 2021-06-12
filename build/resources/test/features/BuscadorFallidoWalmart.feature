Feature: HU-004 Buscador Fallido Walmart


  Scenario Outline: <Escenario> <Producto>
    Given que me encuentro en la pagina de walmart con la url <Url>
    When busco diferentes productos <Producto> en el buscador
    Then podre ver los productos <Producto> buscados

    Examples:
      | Escenario                                        | Producto             | Url                      |
      | Buscar palabra en el buscador de Walmart fallido | sapo unicornio bravo | https://www.walmart.com/ |