package basics;

public class UsefulSyntax {
    public static void main(String[] args) {
        // Create a array
        int[] numbers = {4, 7, 8, 10};
        int[] numbersSecondWay = new int[4];

        // Get array element
        System.out.println(numbers[0]);

        // assign new array element
        numbersSecondWay[0] = 1;

        // for loop
        for(int index=0; index<10; index++){
            System.out.println("Index: " + index);
        }

        // while loop
        int index = 0;
        while (index <3){
            System.out.println("Index: " + index);
            index++;
        }

        // print array with for loop
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // print array with forEach loop
        for(int number: numbers){
            System.out.println(number);
        }

        // string operations
        char[] helloWorldChars = "Hello world".toCharArray();
    }
}