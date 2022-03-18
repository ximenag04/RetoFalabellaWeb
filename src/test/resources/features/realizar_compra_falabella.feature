Feature: realizar la compra de un producto en la pagina oficial de Falabella

  Scenario: realizar compra de producto
    Given el usuario ingresa a la pagina falabella
    When requiere comprar un producto
      | cantidad | departamento | ciudad   | barrio   | direccion | complemento |
      | 2        | ANTIOQUIA    | MEDELLIN | MEDELLIN | Cra 72 80 | Apto 1902   |
    Then verificar el valor del producto