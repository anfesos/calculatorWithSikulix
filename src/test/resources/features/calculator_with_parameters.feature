Feature: This feature pretends make functions of windows's calculator with parameters
  I as user of windows's calculator
  Want to perform functions of sum, subtract, multiplying
  For guarantee its use between 0 and 9

  Background:
    Given The windows's calculator is open

  @sumWithParameters
  Scenario Outline: Windows's calculator sum with parameters
    When user sum one value <FirstValue> with other value <SecondValue> plus one
    Then the result is <result>

    Examples:
      | FirstValue | SecondValue | result |
      | 1          | 1           | 2      |
      | 9          | 0           | 0      |
      | 5          | 3           | 8      |

  @subtractWithParameters
  Scenario Outline: Windows's calculator subtract with parameters
    When user subtract one value <FirstValue> with other value <SecondValue>
    Then the result is <result>

    Examples:
      | FirstValue | SecondValue | result |
      | 1          | 1           | 0      |
      | 9          | 0           | 9      |

  @multiplyingWithParameters
  Scenario Outline: Windows's calculator multiyplying with parameters
    When user multiply one value <FirstValue> with other value <SecondValue>
    Then the result is <result>

    Examples:
      | FirstValue | SecondValue | result |
      | 1          | 1           | 1      |
      | 9          | 0           | 0      |