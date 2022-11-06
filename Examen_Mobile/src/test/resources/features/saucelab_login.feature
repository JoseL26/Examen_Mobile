Feature: Login

  @test
  Scenario: Logueo exitoso

    Given que me enuentro en el login de SauceLab
    When inicio sesión con las credenciales usuario "standar_user" y contraseña "secret_sauce"
    Then valido que se muestre el texto "PRODUCTOS"
    And valido que exista al menos un item