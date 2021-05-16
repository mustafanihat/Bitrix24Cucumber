Feature: search functionality

  Scenario: searching something

    Given as a user I open the youtube
    When I search "herkulnagme"
    Then I should be able to see the "HerkulNagme" channel on page

  @CAD-581
  Scenario: CAD-581 Reset Password Functionality
    Given "admin" is on the "Users and Enrollments" page
    And user creates new user by using temporary email with the following info:
      | first name | last name | username | role |
      |            |           |          |      |
    Given user logs out
    And user clicks on the forgot password button
    When user enters created user email
    Then user should get the "Password Reset!" mail
    And user clicks on "Reset your password" button in the mailbox
    When user resets password on the "Reset Password" page
    Then user should be able to log in

  @CAD-562
  Scenario Outline: CAD-562 Create moderators and instructors
    Given "admin" is on the "Users and Enrollments" page
    When user creates new "<role>"
    Then user should be displayed with correct "<role>"
    Examples:
      | role       |
      | Moderator  |
      | Instructor |

  @CAD-585
  Scenario Outline: CAD-585 Login with email
    Given user is on the login page
    Then user logs in with "<email>" and "<password>"
    Examples:
      | email | password |
      |       |          |