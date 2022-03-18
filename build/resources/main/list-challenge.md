# List Challenge
You are writing an application to reserve seats for a com.ibm.academy.theatre.Theatre using a list of objects.
The com.ibm.academy.theatre.Theatre has *i* number of rows named by a capital letter from A-H (i) and *i* number of seats per row (cols);

- Create a com.ibm.academy.theatre.Seat class with line, row and price properties.
- Create a com.ibm.academy.theatre.Theatre class with a name, list of seats, number of rows and number of seats.
- Add methods to *reserve*, *cancel reservation* and *print* seating chart
- The reserve method must prevent **dups**
- *print* method will show free, reserved and total amount of sold seats, free and reserved.

Use JUnit to verify methods.

## PARA TOMAR EN CUENTA
- https://www.vogella.com/tutorials/JavaRegularExpressions/article.html 
- https://www.arhohuttunen.com/junit-5-parameterized-tests/

## Example
Having a 8x8 theatre

### Input:

Reserve following seats: {"a3","A4","A7","D3","D4","D5","C7","B4","H7"}  
Validate these not allowed: {"a0","A400","X7","","00","AA","D4"}  
Cancel: {"A4"}  

### Output

Output should looks similar. Price $50

Java Cinema  
`..[A3][A4]..[A7].`  
`...[B4]....`  
`......[C7].`  
`..[D3][D4][D5]...`  
`........`  
`........`  
`........`  
`......[H7].`  
`........`  
Total Available: 55  
Total Sold: 9  
Total Income: 450  

## Hints  

Junit  
* ParameterizedTest
* Order
* ValueSource
* MethodSource
* CsvSource

Regex
Collections
String
Integer

