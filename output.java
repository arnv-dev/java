public class output {
    public static void main(String [] args){
        System.out.println("hellow world");
        System.out.println("this is my first java output");


        // Printing Variables and Expressions

        int num1 = 10, num2 = 20;
        System.out.print("the addition of ");
        System.out.print(num1 + " and " + num2 + " is: ");
        System.out.print(num1 + num2);
        System.out.println(); // can print a new line 
    }
}

//System: Systemis a final class present in the java.lang package. It provides access to system-related resources such as input, output, and error streams.
//out: out is a public static object of type PrintStream defined inside the System class. It represents the standard output stream, usually the console.
//println(): println() is a method of the PrintStream class. It prints the specified value and then adds a new line at the end of the output. It is an enhanced version of print().