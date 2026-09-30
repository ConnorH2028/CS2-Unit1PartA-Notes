import java.util.Scanner;
/*
9/18
This is my comment space! Wohoo!
Algorithm --> step by step process to accomp a task
Pseudocode --> simplified code to outline programs/algorithms
ex. addfunc()
num1
num2
1+2 prints
sequencing: order of steps
Java:
- ment or a vtural machien
- diffrent plug in
- It a OOP programing language
- stronger program
Javascript
- ment for only browser usage
- diffrent plug in
- Its an OOP Spricpting language
9/22
- Object Oriented Programming --> Programming built on classes and objects    
- Class --> Blueprint of an object that has no memory 
- Object --> Actual implementation that is stored in memory 
- Method --> Reusable chunk of code that accomplishes an action 
- Main() --> entry point to our code. We code in an IDE with a compiler
- Compiler--> Translate our java to binary 
9/23
- Variable --> A labeled memory location in the computer that can store a value that can change or vary while a program is running.
- There are two types of variables in Java:
 - Primitive Type - storing simple information.data (ex. int x = 5;)
 - Object (Reference) Type - storing complex data/objects (ex. Creature cat = new Creature)

 -- Primitive Variable Types To Know:
 1. int - stores intergers/positive or negative whole numbers
 2. double- store decimal numbers (ex. double x = 5.0;) (ex. double y = 4.25;)
 3. boolean - stores logic (only two options are True or False)

Object Variable Type to Know:
1. String - stores text (ex. "5.0", "Hello, world!")

Setting Up Variables In Code:
Declaring + Assigning go togeather
1. Decalring Variable --> int x; String name;
2. Assign Variable --> x = 5; name = "Connor"

Or do it in one step!
3. Initialize Variable --> int x=5; String name = "Connor"
*/




public class Main {

   public static void main(String []args) {
      //int num;
      //num = 5;
    //  System.out.println("num");

      //declare a variable
     // double myGradeAverage;
      //assign a value
      //myGradeAverage = 95.0;
      
      //initialize a variable --declare and assign in one statement
      //double myDreamGrade = 100.0;

      // we can format strings using concatenation (+)
     // System.out.println("My current grade is:" + myGradeAverage);
      // print statement for ideal grade
     // System.out.println("I want my grade to be:" + myDreamGrade + "!");

      // printing a quote using an escape sequence
      // escape sequence always use a \
      // \n give a new line
      // we use \\ to actually print one \
     // System.out.println("My teacher \\alwasys says,\n\"Study for your test!\"");
     // System.out.println("My average grade \ is:95.0 \however\n\" my dream grade is:100.0\""+m);

     // System.out.print("Hi ");
      //System.out.print("there");
     // System.out.println("!");

      //arithmetic operations (+ - * /)
      // working with only ints, output will be an int
      // int/int dose TRUNCATING DIVISION removes the decimal, dose not round
     // System.out.println(5*10);
      // if we want to divide and get a decimal, we need to divide with a doubble
     // System.out.println(19.0/10.5);
      // % gives us the remainder
     // System.out.println(12%10);

      int myNum = 7;
      int newNum = myNum;
      newNum = 8;

      System.out.println(myNum);
      System.out.println(newNum);

      // incrementing variable
      myNum = myNum + 1;
      myNum = myNum + 1;

      // handles the assignment and the addition all at once
      myNum++;

      // decrementing
      myNum= myNum -1;
      myNum--;

      //System.out.println(myNum);
      //System.out.println(newNum);
     // System.out.println(myNum);

     //working with Scanner class and text input
     System.out.println("Greetings human! What is your name?");
      Scanner scan = new  Scanner(System.in);

   }
}
