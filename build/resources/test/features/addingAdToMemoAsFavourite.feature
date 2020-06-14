Feature: Adding ad to memo as a favorite
  https://reklama.bb.lv/ru/

  Please be sure to achieve a reasonable coverage of the feature to test.
  Feel free to do any other use case that you feel could demonstrate your testing decisions better.

  Acceptance criteria
  - feature is reasonably tested with asserts that make business sense;

  Background:
    * let variable "URL" equal to "https://reklama.bb.lv/ru/"

  Scenario: Adding ad to memo as a favourite
    Given webpage 'Reklama.bb.lv' is opened
    And random category is selected from 'Reklama.bb.lv'
    And random subcategory is selected from categories of 'Reklama.bb.lv'
    And random advertisement is opened from subcategories of 'Reklama.bb.lv'
    When advertisement is added to favourites
    Then advertisement should be found in the “Memo" section

  Scenario: Adding ad to memo as a favourite you can select ads from the list and add several to Memo at once.

  Scenario: Adding ad to memo as a favourite You can do that while searching as well - the advanced search from the header menu.