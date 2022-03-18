Feature: realizar la compra de un producto en la pagina oficial de Falabella

  Scenario: realizar compra de producto
    Given el usuario ingresa a la pagina falabella
    When requiere comprar un producto
      | cantidad | departamento | ciudad   | barrio   | direccion | complemento | numtarjeta        | numdocumento |
      | 2        | ANTIOQUIA    | MEDELLIN | MEDELLIN | Cra 72 80 | Apto 1902   | 44567812309175413 | 1152464708   |
    Then verificar el valor del producto