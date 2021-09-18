********This is the Maven project created for testing the web application - http://jupiter.cloud.planittesting.com*********
There are 2 packages under src/test/java

* jupiter.base --> This package contains BaseClass
* jupiter.tests --> This packagke contains test scenarios for the scripts ContactPage creation, CartItems verification and Sub total calculation.

* TestCase 1 - The ContactPage.java will run 5 times and verifies the contact information page
* Testcase 2 - The CartItems.java will run once and verifies the items in the cart.
* TestCase 3 - The Subtotal.java will run once and verifies the sub total in the cart.

The dependencies are prersent in pom.xml. This file also contains the surefire plugin for running various testNG/xml files.
Regression.xml/TestNG suite includes all the test cases.
