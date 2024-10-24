Feature: This is the login feature for Orange HRM using DataTableWithExamples

Scenario Outline: Login feature DataTableWithExamples
  Given Proceed to login scenario
  When user enters "<UserName>" and password "<Password>"
  And clicked button
  Examples:
    | UserName | Password  |
    | Admin    | admin123  |
    | admin    | admin13   |
