 Chat App – Part One

 Overview

This project implements the Registration and Login feature of a Java Chat App. It validates user information before registration and allows registered users to log in using their stored credentials.

 Features

-Validates username containing `_` and no more than 5 characters.
-Validates password with at least 8 characters, 1 capital letter, 1 number, and 1 special character.
-Validates South African phone numbers using the `+27` country code.
-Registers the user only when all validations are successful.
-Verifies username and password during login.
-Displays appropriate registration and login messages.

 Technologies

-Java
-NetBeans
-Regular Expressions (`Pattern`)
-Object-Oriented Programming

 Main Class

`LoginPartOne`

 Key Methods

- `checkUserName()` – validates the username.
- `checkPasswordComplexity()` – validates password requirements.
- `checkCellPhoneNumber()` – validates the phone number.
- `registerUser()` – completes the registration process.
- `loginUser()` – verifies login credentials.
- `returnLoginStatus()` – displays the login result.

 References

Farrell, J. 2018. Programming Logic and Design. 9th ed. Cengage Learning.

Oracle. 2025. Java Platform SE Documentation.
