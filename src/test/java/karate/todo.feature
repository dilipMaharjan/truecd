Feature: Test todo api
  Scenario: Test Get list of todos
    Given url 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200