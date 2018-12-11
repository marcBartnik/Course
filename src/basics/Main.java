package basics;

public class Main {

    public static void main(String[] args) {
//        napis();
//        suma(2, 3);
//        srednia(4,5);

//        print();
//        sum(100, 45);
//        divide(100, 10);
        calculations();
        calculateRectangleArea(100, 10);
        calculateAverage(3, 10, 17);
        calculateBmi(75, 1.60);
        convertMinutes(60 * 24 * 36);
    }

    // 1. Create a method print() which will print 'Hello' on screen and then print your name on a separate line and execute it in main().
    private static void print() {

        System.out.println("Hello \n" + "Marcin");
    }

    // 2. Create a 'sum(int a, int b)' method which will print the sum of two numbers and execute it in main() with a=100 and b=45.
    private static int sum(int a, int b) {

        System.out.println(a + b);
        if (divide(1, 2) < 1)
            System.out.println("True");
        return a + b;
    }

    // 3. Create a 'divide(int a, int b)' method which will divide two numbers and print on the screen and execute it in main() with a=100 and b=10.
    private static double divide(double a, double b) {

        double result = a / b;
        System.out.println(result);
        return result;
    }

//     4. Create a calculations() method which will print the result of the following operations:
//    	a. -5 + 8 * 6
//    	b. 69 % 9
//    	c. 20 + -3*5 / 8             20-2
//    	d. 5 + 15 / 3 * 2 - 8 % 3    5+10-2=13

    /**
     * Method made few calculation.
     */
    private static void calculations() {

        int a = -5 + 8 * 6;
        double b = 69 % 9;
        double c = 20 + ((-3.0 * 5.0) / 8);
        double d = 5 + ((15.0 / 3) * 2) - (8 % 3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    // 5. Create a method calculateRectangleArea(int width, int height)  which will calculate and print the area of a rectangle. Execute it in main() with width=100 and height=10.

    /**
     * Method calculate rectangle area.
     *
     * @param length int value
     * @param width  int value
     */
    private static void calculateRectangleArea(int length, int width) {

        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }

    // 6. Create a method calculateAverage(int a, int b, int c) which will calculate and print the average of the numbers. Execute it in main() with a=3 b=10 c=17.

    /**
     * Methods calculates average from three variables
     *
     * @param a int value
     * @param b int value
     * @param c int value
     */
    private static int calculateAverage(int a, int b, int c) {

        int average = (a + b + c) / 3;
        System.out.println("Average from variables equals: " + average);
        return average;
    }

    // 7. Create a method double calculateBmi() which will calculate body mass index (bmi = weight/height^2).

    /**
     * Method calculates your`s BMI.
     *
     * @param weight how many kilograms you have
     * @param height how toll you are in meters
     * @return bmi
     */
    private static double calculateBmi(double weight, double height) {

        double bmi = (weight / (height * height));
        System.out.println("Your BMI is: " + bmi);
        return bmi;
    }

    // 8. Create a method void convertMinutes(int minutes) which will convert minutes into a number of years and days. Print the result.

    /**
     * Method calculates how many years and days give you minutes.
     *
     * @param minutes amount of minutes you wanna convert to years an days
     */
    private static void convertMinutes(int minutes) {

        int dayInMinutes = 60 * 24;
        int yearInMinutes = 60 * 24 * 365;
        int years = minutes / yearInMinutes;
        int rest = minutes % yearInMinutes;
        int days = rest / dayInMinutes;
        System.out.println("Your`s minutes equal " + years + " years and " + days + " days");
    }


    // TODO homework
    // 9. Write a Java program that reads an integer between 0 and 1000 and sum all the digits in the integer. Create a method sumDigitis(int number)

    public static int sumDigitis(int number) {

        int result = number++;
        System.out.println();
        return result;
    }


//    private static double srednia(int first, int second) { return (first+second)/2; }
//
//    private static int suma(int a, int b) { return a+b; }
//
//    private static void napis() { System.out.println("napis"); }


//int and Integer
//primitive and complex
}
