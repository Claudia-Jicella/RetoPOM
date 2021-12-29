# new feature
# Tags: optional

Feature: Consulta a la página Despegar.com
  Como ejecutivo de la empresa Sofka
  necesito viajar frecuentemenete a diferentes ciudades
  con el fin de cerrar negocios con los clientes

  Background:
    Given que el ejecutivo  de Sofka se encuentra en la página web de Despegar en la opcion Vuelos

  @regression
  Scenario: Opción de pago de una reserva en clase Economica
    When que el ejecutivo selecciona la opcion Solo ida, llene los campos obligatorios y confirme la acción
    Then el sistema debera mostrar las opciones de pago

  @ignore
  Scenario: Opción clase
    When que el ejecutivo selecciona la opcion Solo ida, llene los campos obligatorios y confirme la acción
    Then el sistema debera mostrar la clase escogida y el equipaje que se debe llevar


