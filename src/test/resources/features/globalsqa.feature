Feature: Crear orden en aplicación globalsqa
  Yo como usuario
  Quiero agregar mi producto celular a mi carrito y poder realizar la compra
  Para que me lo puedan enviar

  Background: Ingresamos a la aplicacion seleccionando samplepage
    Given que ingreso a la aplicacion globalsqa
    And seleccionamos en el menu samplepage

  Scenario Outline: Validar mis datos de registro de manera exitosa
    When yo ingreso mis datos mi name <name>  mi email <email>  mi web site <website> , mi experiencia <experience>, expertice <expertice> , mi comentario <comment> y mi educacion <education>
    Then yo valido que se genera una visualizacion de mis datos <name> , <email> , <website> , <experience> , <expertice> , <comment> , <education>
    Examples:
      | name    | email          |website                  | experience | comment             | expertice         | education     |
      | Miriam  | miriam@got.com |http://www.miriam.com    |1-3         | descripcion general | Automation Testing| Post Graduate |