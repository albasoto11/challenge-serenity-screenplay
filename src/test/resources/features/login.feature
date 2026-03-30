Feature: Ingresar a la pantalla login
@authenticationLogin
  Scenario: Abrir la página web
  Given que soy usuario "cliente" abre el sitio web
  When cuando ingreso al navegador
  Then debe visualizar el "Swag Labs"

Scenario: Login exitoso con credenciales válidas
Given que el usuario abre la página de inicio de sesión
When ingresa el usuario "standard_user"
And ingresa la contraseña "secret_sauce"
And hace clic en el botón de inicio de sesión
Then el usuario debería ver la página de productos
And debería ver el título "Swag Labs"


