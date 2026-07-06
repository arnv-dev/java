//Import the Scanner class using import java.util.Scanner;
//2. Create a Scanner object Scanner sc = new Scanner(System.in); // System.in represents standard input (keyboard).
//3. When we want to ask the user for input, first print a prompt message so they know what to enter. Then use one of Scanner's handy methods to read the response:
//nextInt() for whole numbers
//nextLine() for full text lines
//nextDouble() for decimal numbers
//next() for single words

import java.util.Scanner;

public class input {
    public static void main(String [] args){
        //create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("sum:" + (a+b));

        sc.nextLine();

        //taking diffrent type of inputs

        System.out.print("enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Entered sentencee is: " + sentence);

        System.out.print("enter a integer: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("the integer is: " + x);

        System.out.print("Enter a float value: ");
        float f = Float.parseFloat(sc.nextLine());
        System.out.println("the entered float value is: " + f);
        
        sc.close();

    }
}


/*
Method

Description
 nextBoolean()        Used for reading Boolean value.
nextByte()            Used for reading Byte value.
nextDouble()          Used for reading Double value.
nextFloat()           Used for reading Float value.
nextInt()             Used for reading Int value.
nextLine()            Used for reading Line value.
nextLong()            Used for reading Long value.
nextShort()           Used for reading Short value.
next()                Used for reading a single word
*/