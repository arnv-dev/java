public class datatypes {
    public static void main(String[] args) {

        //premitive data types 

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        byte age = 25;
        byte temperature = -10;
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);

        short students = 1000;
        short temp = -200;
        System.out.println("Number's of Students: " + students);
        System.out.println("Temperature: " + temp);

        int population = 2000000;
        int distance = 150000000;
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);

        long worldPopulation = 7800000000L;
        long lightYears = 9460730472580800L;
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Light Years: " + lightYears);

        float pi = 3.14f;
        float gravity = 9.81f;
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);

        double piee = 3.141592653589793;
        double avogadro = 6.02214076e23;
        System.out.println("Pi: " + piee);
        System.out.println("Avogadro's Number: " + avogadro);

        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);

        //2.Non-Primitive (Reference) Data Types

        String name = "arnv";
        String message = "Welcome to Java";
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);

        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"arnv1", "arnv2", "arnv3"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);

    }

}
