Feature: Movie suggestion feature

  As a user I should be able to get movies according to my preference

  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation


  Scenario: Movie search datatable List
    Given I like
      | genre     |
      | action    |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to homepage
    Then I should get right recommendation


  Scenario: Movie search datatable Map
    Given I like below favorite movie with certain type
      | actions   | John Wick   |
      | drama     | Titanic     |
      | cartoon   | Tom & Jerry |
      | adventure | Tomb Raider |
    When I go to homepage
    Then I should get right recommendation

  Scenario: Movie search datatable list of List
    Given I like below movies with rating
      | Genre     | Name        | Ratings |
      | actions   | John Wick   | 9.3     |
      | drama     | Titanic     | 9.9     |
      | cartoon   | Tom & Jerry | 10.0    |
      | adventure | Tomb Raider | 9.9     |
    When I go to homepage
    Then I should get right recommendation


  Scenario: Movie search datatable list of List
    Given I like below movies table with rating
      | Genre     | Name        | Ratings |
      | actions   | John Wick   | 9.3     |
      | drama     | Titanic     | 9.9     |
      | cartoon   | Tom & Jerry | 10.0    |
      | adventure | Tomb Raider | 9.9     |
    When I go to homepage
    Then I should get right recommendation
