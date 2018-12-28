package basics;

public class Scanner {

    public static void main(String args[]) {

//        isPalindrom("Kafak");
//        playGame();
        System.out.println(retrieveWeekDay(5));
    }

    private static boolean isPalindrom(String input){

        for (int i=0;i<input.length()/2;i++) {
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                return false;
            }
        }return true;
    }

    private static void playGame() {

        Scanner keyboardInput = new Scanner();
        Integer secretNumber = (int) (Math.random() * 11);
        System.out.println(secretNumber);
        boolean win = false;
        System.out.println("Hi, what is yout number between 0 and 10?");

        do {

            Integer guess = keyboardInput.hashCode();
            System.out.println("Your guess is:\n" + guess);

            if (guess.equals(secretNumber)) {
                System.out.println("You win! Congratulations!");
                win = true;
                System.out.println("End of the game");
            } else if (guess < secretNumber) {
                System.out.println("Your number is smaller than the secret number. What is your new number between 0 and 10?");
            } else {
                System.out.println("Your number is greater than the secret number. What is your new number between 0 and 10?");
            }
        } while (!win);
    }

    //3. Create a method 'retrieveWeekDay(int numberOfWeekDay)' which will return weekday based on number e.g for 1 - Sunday, 2 - Monday etc. Test it main(); Use swith case statement.

    private static String retrieveWeekDay(int numberOfWeekDay) {

        if (1 > numberOfWeekDay || numberOfWeekDay > 7) {
            System.out.println("You put incorrect number. Please set number from range (1, 7)");
        }

        switch (numberOfWeekDay) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "There is no such day in a week";
        }
    }

    // 4. TODO homework - Create a method 'fizzBuzz()'' which will print the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
    // 5. TODO homework zintegruj intellij z gitlabem, dodaj swoje konto na gitlabie
}