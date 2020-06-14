# Test Task: Shopping

## System under test
https://reklama.bb.lv/ru/ - portal of private ads, widely used in Latvia.

## Feature to test
Adding ad to memo as a favorite. 
1. Go to any category, 
1. search for an ad, 
1. open it, 
1. scroll down to see “Add to favorites”. 
1. Once you click it, it gets added to the “Memo" section (on the top in the header menu).

* Alternatively, you can select ads from the list and add several to Memo at once.
* You can do that while searching as well - the advanced search from the header menu.
* Please be sure to achieve a reasonable coverage of the feature to test.
* Feel free to do any other use case that you feel could demonstrate your testing decisions better.

## Limitations
**Java** and **Selenium** combo.

## Acceptance criteria
* feature is reasonably tested with asserts that make business sense;
* spec is readable and not too verbose (feel free to use **Cucumber**);
* solution is well structured, test logic decoupled from app specifics (like page object pattern or other alternatives).