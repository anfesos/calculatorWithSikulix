Feature: This feature pretends make functions of windows's calculator
  I as user of windows's calculator
  Want to perform functions of adding, subtract, multiplying
  For guarantee its use

  Background:
    Given The windows's calculator is open

  @sum
  Scenario: Windows's calculator add
    When user sum one plus one
    Then the result is two

  @subtract
  Scenario: Windows's calculator subtract
    When user subtract one plus one
    Then the result is zero

  @multiplying
  Scenario: Windows's calculator multiyplying
    When user multiply one by one
    Then the result is one