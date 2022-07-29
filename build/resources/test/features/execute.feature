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

  @cambioPosAPre
  Scenario: se requiere realizar un cambio de plan pos a pre
    Given Se ingresa al portal CRM para activacion
    When Se hace el cambio plan de pos a pre
    Then Se deberia ver en pantalla unica la linea en plan pos

  @cambioPreAPos
  Scenario: se requiere realizar un cambio de plan pre a pos
    Given Se ingresa al portal CRM para activacion
    When Se hace el cambio plan de pre a pos
    Then Se deberia ver en pantalla unica la linea en plan pre

  @Suspension
  Scenario: se requiere realizar la suspension de una linea
    Given Se ingresa al portal CRM para activacion
    When Se ejecuta la suspension de la linea
    Then Se deberia ver en pantalla unica la linea en estado suspendida

  @Reconexion
  Scenario: se requiere realizar la reconexion de una linea
    Given Se ingresa al portal CRM para activacion
    When Se ejecuta la reconexion de la linea
    Then Se deberia ver en pantalla unica la linea en estado reconectada

  @PosPayPortability
  Scenario: se requiere realizar una portabilidad pospago
    Given Se ingresa al portal CRM para activacion
    When se hace la solicitud de portabilidad
    And se realiza la activacion de la linea a portar
    And Se deberia ver en pantalla unica la linea en estado activado
    And se ejecutan los procedimientos preventana
    And se crea la ventana de portacion en SoapUi
    And se realiza la ejecucion de la shell de portacion
    Then Se deberia ver en pantalla unica la linea en estado activado la linea portada

  @PrepayPortability
  Scenario: se requiere realizar la reconexion de una linea
    Given Se ingresa al portal CRM para activacion
    When se hace la solicitud de portabilidad prepago
    And se realiza la activacion de la linea portada
    Then Se deberia ver en pantalla unica la linea prepago en estado activado
    And se ejecutan los procedimientos preventana prepago
    And se crea la ventana de portacion en SoapUi prepago
    And se realiza la ejecucion de la shell de portacion
    Then Se deberia ver en pantalla unica la linea en estado activado la linea prepago portada

  @portalCesionNitaNit
  Scenario: se requiere realizar una cesion de contrato nit a nit
    Given Se ingresa al portal CRM para activacion
    When Se hace la cesion de contrato de una linea nit a nit
    Then Se deberia ver en pantalla unica la linea cedida con nit

  @portalNintendoNit
  Scenario: se requiere realizar una activacion nintendo con nit
    Given Se ingresa al portal CRM para activacion
    When Se hace activacion de una linea nintendo con nit
    Then Se deberia ver en pantalla unica la linea activa nintendo con nit