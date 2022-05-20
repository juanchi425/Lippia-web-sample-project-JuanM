Feature:El usuario se logea en la web correctamente

  @Test
  Scenario: El usuario se logea correctamente con credenciales validas
    Given El usuario se encuentra en la web automation  practice
    When El usuario clickea el boton "My acocount" del menu
    And  El usuario ingresa su username ""
    And  El usuario ingresa su password ""
    And  El usuario clickea el boton login
    Then El usuario verifica que ingreso correctamente a la web

