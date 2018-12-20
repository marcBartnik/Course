package basics;

public class Arrays {

    public static void main(String[] args) {

//        print(getArray());

        char[] array = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        printArray(array);
        String text = "abcdef";
        reversePrint(text);
    }

    // 1. In main() create Array of String and then create a 'print(String[] input)' method which will print created array with for loop

    /**
     * Method prints all  given array.
     *
     * @param input
     */
    private static void printArray(String[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    private static String[] getArray() {

        String[] array = {"Tomek", "Romek", "Mateusz", "Damian"};
        return array;
    }

    // 2.  In main() create Char[] array from "Hello world" string and then create a 'print(char[] input)' method which will print created array with while loop.
    /**
     * Method prints all given char array.
     *
     * @param input char array
     */
    private static void printArray(char[] input) {

        int index = 0;
        while (index < input.length) {
            System.out.print(input[index]);
            index ++;
        }
    }

    // 3. Create a 'reversePrint(String input)' method which will reverse a string and print it. Execute in main().

    private static void reversePrint(String input) {

        for (int i = input.length(); i >-1; i-- ) {
            System.out.println(input.charAt(i));

        }
    }
}