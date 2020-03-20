#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Pantalla Simulación de crédito
  El usuario debe validar el funcionamiento de la pantalla
  Simulación de Créditos al calcular valores en el campo
  "Valor Cuota"

  @CasoExitoso
  Scenario: Simulación de cuota al ingresar los datos
  		El sistema calcula la cuota de un prestamo en base a los criterios ingresados
    Given Selecciona la opción simula tu cuota
    When Ingresa los criterios solicitados
    	| ¿Qué deseas simular? | Ingresa tu fecha de nacimiento | ¿Con qué tipo de tasa quieres tu préstamo? | ¿Cuál es el producto de crédito que deseas adquirir? | ¿Cuál es el plazo que necesitas para tu préstamo? (meses) | ¿Cuánto es el valor que deseas prestar? ($) |
      | Simula tu cuota			 | 1990-08-29										  | Tasa Variable															 | Crédito de Libre Inversión  													|			36																										| 10,000,000.00																|
    Then El sistema calcula la cuota del prestamo solicitado


	@CasoFallido
  Scenario: Diligencio con errores al simular cuota
  		Se presento etiqueta informativa indicando error en el diligenciamiento de algunos campos
    Given Selecciona la opción simula tu cuota
    When Ingresa los criterios solicitados
  		| ¿Qué deseas simular? | Ingresa tu fecha de nacimiento | ¿Con qué tipo de tasa quieres tu préstamo? | ¿Cuál es el producto de crédito que deseas adquirir? | ¿Cuál es el plazo que necesitas para tu préstamo? (meses) | ¿Cuánto es el valor que deseas prestar? ($) |
      | 										 | 1990-08-29											| Tasa Variable															 | Crédito de Libre Inversión  													|			36																										| 10,000,000.00																|
      | Simula tu cuota			 | 1990-08-29										  | Tasa Variable															 | Crédito de Libre Inversión  													|			36																										| 10,000,000.00																|
    Then Verificar que se presente Etiqueta Informativa de validación requerida
	
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
