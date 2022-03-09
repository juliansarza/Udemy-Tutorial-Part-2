import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        // 11. Getting User Input
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter a floating point value: ");

        // Wait for the user to enter something.
        double value = input.nextDouble();

        // Tell them what they entered.
        System.out.println("You entered: " + value);
        */
        
        /*
        // 12. Do ... While
        Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Enter a number: ");
        // int value = scanner.nextInt();
        
        // while(value !=5) {
        //     System.out.println("Enter a number: ");
        //     value = scanner.nextInt();
        // }
        

        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        while(value != 5);

        System.out.println("Got 5!");
        */

        /*
        // 13. Switch
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text) {
            case "start":
            System.out.println("Machine started!");
            break;

            case "stop":
            System.out.println("Machine stopped.");
            break;

            default:
            System.out.println("Command not recognized");

            // Close scanner
            input.close();
        }
        */

        /*
        // 14. Arrays
        int value = 7;

        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};

        for(int i=0; 1<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        */

        /*
        // 15. Arrays of Strings
        String[] words = new String[3];     

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        int value = 0;

        String text = null;

        System.out.println(text);

        String[] texts = new String[2];

        System.out.println(texts[0]);

        texts[0] = "one";
    }
    */

    // 53. ArrayList: Arrays the Easy Way
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nInteration #1: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing items (careful!)
        numbers.remove(numbers.size() - 1);

        // This is VERY slow
        numbers.remove(0);

        System.out.println("\nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);

        // List interface ...
        List<String> values = new ArrayList<String>();
        }
    }
}
