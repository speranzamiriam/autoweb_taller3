@CrearCuenta
Feature: Funcionalidad Crear cuenta linio
  Como usuario dentro de la aplicación de linio
  Quiero crearme una cuenta
  Para poder realizar mis compras y visualizar mis pedidos realizados

  Rule: Creación de cuenta en linio

    Background: Ingresar a la aplicación
      Given que yo ingreso a la aplicacion de linio

    ######## GHERKIN DECLARATIVO ################
    @regresion1
    Scenario: Crear cuenta de usuario de manera exitosa
      When yo me registro en la aplicación de linio
      Then yo visualizo le mensaje de creacion exitosa

    ######## GHERKIN IMPERATIVO #################
    @regresion2
    Scenario: Crear cuenta de usuario de manera exitosa
      When yo ingreso mi nombre Erick en el campo name
      And yo ingreso mi apellido Montes
      And yo ingreso mi correo monteserick199@gmail.com
      And yo ingreso mi contraseña 123456
      And selecciono el tipo de documento DNI
      And ingreso mi numero de documento 12345678
      And selecciono la politica de privacidad y terminos condiciones
      And yo le doy click en Completar Registro
      Then yo visualizo le mensaje de creacion exitosa

    @regresion_happy
    Scenario Outline: Crear cuenta de usuario de manera exitosa
      When yo ingreso mi datos <nombre>, <apellido>, <correo>, <password>, <tipo>, <numeroDNI> a registrar
      Then yo visualizo le mensaje <mensaje> de creacion exitosa
      And yo valido el tipo de documento <tipo>
      Examples: Exitoso
        | nombre | apellido | correo                   | password | tipo | numeroDNI | mensaje  |
        | Erick  | Montes   | monteserick199@gmail.com | 123456   | DNI  | 12345678  | mensaje1 |


    @regresion_unhappy
    Scenario Outline: Crear cuenta de usuario de manera errada
      When yo ingreso mi datos <nombre>, <apellido>, <correo>, <password>, <tipo>, <numeroDNI> a registrar
      Then yo visualizo le mensaje <mensaje> de creacion errada
      Examples: Fallido
        | nombre | apellido | correo                   | password | tipo                  | numeroDNI | mensaje           |
        | Erick  |          | monteserick199@gmail.com | 123456   | Cedula de Extranjeria | 12345678  | Falto el apellido |
        | Erick  | Montes   |                          | 123456   | Pasaporte             | 12345678  | Falto el correo   |
