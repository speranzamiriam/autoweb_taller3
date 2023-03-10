Feature: Crear orden en aplicación DemoBlaze
  Yo como usuario
  Quiero agregar mi producto celular a mi carrito y poder realizar la compra
  Para que me lo puedan enviar

  Background: Ingresamos a la aplicacion seleccionando un producto
    Given que ingreso a la aplicacion demoblaze
    And seleccionamos el primer producto

  Scenario Outline: Validar mi nombre y tarjeta de manera exitosa
    When yo agrego el producto al carrito de compras
    And yo ingreso mis datos mi nombre <nombre> y mi tarjeta <cards>
    Then yo valido que se genera la orden correctamente con mis datos <nombre> y <cards>
    Examples:
      | nombre | cards          |
      | Erick  | 41588378782323 |