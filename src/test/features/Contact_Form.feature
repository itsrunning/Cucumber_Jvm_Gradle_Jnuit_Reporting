Feature: Using Contact Form

  @outline
  Scenario Outline: To verify pages
    Given i am in the google home page
    And i search for <searchnames> in page
    Then i see more than one result displayed
    Examples:
      | searchnames |
      | "html tutorial" |
      | "browserstack"  |

  @normal
  Scenario: Simple google search 1
    Given i am in the google home page
    When i search for "html tutorial" in page
    Then i see more than one result displayed

  @normal
  Scenario: Simple google search 2
    Given i am in the google home page
    When i search for "browserstackertyjuyktgfedfewgrthyjtukjtyhrgefdefwrgth" in page
    Then i see more than one result displayed


