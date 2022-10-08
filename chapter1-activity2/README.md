# password-generator
## About
A very simple CLI password generator in Java.

## What it does
- Asks the user for the length of password it needs to generate. 
- If no input errors found, it outputs a randomly generated password then exit the program.
- If there are errors (I've only handled 2 error cases for wrong input and the minimum password length),
the program will display a short error text description and will keep prompting the user until the user 
satisfies the program.
- User can only quit the program when it has already generated a password or by pressing `Ctrl + c`

## Installation
Clone the repo:
```sh
git clone https://github.com/corpuzz/password-generator.git
```
Compile:
```java 
javac PasswordGen.java
```
Run:
```java
java PasswordGen
```


