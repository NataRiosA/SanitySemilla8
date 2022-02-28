@test
Feature: Sanity limpieza y aprovisionamiento de recursos

  yo como que quiero realizar una limpieza de recursos
  cargar la mercancia y el inventario en la plataforma epos

  @epos
  Scenario: se quiere ingresar a la plataforma epos
    Given Se ejecutan procedimientos en bd y soapUi
    When Se ingresa a la plataforma epos para cargue de inventario
    And Se ingresa a entrada masiva de mercancia
    Then Se completa datos para cargar mercancia

  @inventory
  Scenario: realizar el cargue de inventario
    Given Se ingresa a la plataforma epos para cargue de inventario
    When  Se ingresa a cargue de inventario
    Then Deberia poder realizar el cargue de inventario

  @windex
  Scenario: realizar la confirmacion de inventario
    Given se ingresa a la plataforma epos windex
    Then se deberia poder ver mensaje de confimacion exitosa

  @portalPrepaid
  Scenario: se requiere realizar una activacion de una linea en prepago
    Given Se ingresa al portal CRM para activacion
    When Se hace activacion de una linea en prepago
    Then Se deberia ver en pantalla unica la linea activa en prepago

  @portalNintendo
  Scenario: se requiere realizar una activacion de una linea en control nintendo
    Given Se ingresa al portal CRM para activacion
    When Se hace activacion de una linea nintendo
    Then Se deberia ver en pantalla unica la linea activa nintendo

  @portalCesionPreAPos
  Scenario: se requiere realizar cambio de linea de Pre a Pos
    Given Se ingresa al portal CRM para activacion
    When Se hace la cesion de contrato de una linea pre a pos
    Then Se deberia ver en pantalla unica la linea cedida pre

  @portalCesionPosAPre
  Scenario: se requiere realizar cambio de linea de Pos a Pre
    Given Se ingresa al portal CRM para activacion
    When Se hace la cesion de contrato de una linea pos a pre
    Then Se deberia ver en pantalla unica la linea cedida pos

  @portalAvanger
  Scenario: se requiere realizar una activacion de una linea en control avenger
    Given Se ingresa al portal CRM para activacion
    When Se hace activacion de una linea avanger
    Then Se deberia ver en pantalla unica la linea activa avanger