  Feature: let s talk
  Scenario Outline:  Assenceur émotionnel
    Given i stil in life and have "<emotion>"
    When I do have problems
    Then I will be "<result>" in step

    Examples: 
      | emotion | result  |
      | hope    | joyful  |
      | anger   | bad     |
      | hopef   | joyfulb |

