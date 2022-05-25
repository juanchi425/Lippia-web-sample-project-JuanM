 Feature: El usuario se logea en la web correctamente

  @Test
 Scenario: El usuario se logea correctamente con credenciales validas
   Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el botón "My Account" del menú
    And El usuario ingresa su username "juanema@gmail.com"
    And El usuario ingresa su password "JuanMtestin@2020"
    And El usuario clickea el botón "Login"
    Then El usuario verifica el logueó






