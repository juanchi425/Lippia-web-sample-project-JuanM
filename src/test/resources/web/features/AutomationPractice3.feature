
Feature: El usuario visualiza los productos Populares correctamente

  @Test3
    Scenario: El usuario visualiza los productos populares
  Given El usuario se encuentra en la web Automation Practice
     When El usuario clickea el boton "Shop" de la home
     And El usuario Selecciona el menu desplegable "Default sorting"
     And El usuario selecciona la opcion "Sort by popularity"
     Then El usuario visualiza los productos mas populares
