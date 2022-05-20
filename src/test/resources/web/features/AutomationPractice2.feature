 #Feature: El usuario se logea en la web correctamente

 # @Test
# Scenario: El usuario se logea correctamente con credenciales validas
   # Given El usuario se encuentra en la web Automation Practice
    #When El usuario clickea el botón "My Account" del menú
    #And El usuario ingresa su username "juanema@gmail.com"
    #And El usuario ingresa su password "JuanMtestin@2020"
    #And El usuario clickea el botón "Login"
    #Then El usuario verifica el logueó


 #Feature: El usuario selecciona un producto correctamente

   #@Test2
   #Scenario: El usuario Selecciona y visualiza un producto  correctamente
    # Given El usuario se encuentra en la web Automation Practice
     #When El usuario clickea el boton "Shop" de la home
     #And El usuario clickea en el  producto Selenium Ruby
     #Then El usuario visualiza el producto


 Feature: El usuario visualiza los productos Populares correctamente

  @Test3
     Given El usuario se encuentra en la web Automation Practice
     When El usuario clickea el boton "Shop" de la home
     And El usuario Selecciona el menu desplegable "Default sorting"
     And El usuario selecciona la opcion "Sort by popularity"
     Then El usuario visualiza los productos mas populares
