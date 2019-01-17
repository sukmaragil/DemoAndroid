Feature: Add a TODO item
  In order to remind things To Do
  As a user
  I want to add to do item

  @Regression
  Scenario Outline: Add a ToDo item 'Training Class'
#    Given the user in to-do list screen
    When user want input data
#    When the user add new to-do with title "<Title>" and description "<Description>"
#    Then Active Task on Statistics menu should be <ActiveTasks>

    Examples:
    |Title            | Description               | ActiveTasks |
    |Training class 1 | Create new cucumber story | 1           |
#    |Training 2       | Create new story          | 2           |
