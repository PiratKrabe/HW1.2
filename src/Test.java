import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        runMenu();
    }

    private static int inputIntNumbers() throws Exception {

        int result;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                result = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Invalid input. Enter the number");
            }
        }
        return result;
    }


    private static void runMenu()

    {
        System.out.println("Enter size of array");
        int arraySize = 0;

        try {
            arraySize = inputIntNumbers();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (arraySize > 0) {

            int arrayInput[] = new int[arraySize];
            int indexOfArray = 0;

            while (indexOfArray < arrayInput.length) {
                System.out.println("Enter " + (indexOfArray + 1) + " element of the array");
                try {
                    arrayInput[indexOfArray] = inputIntNumbers();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                indexOfArray++;
            }

            System.out.println("Initial array: " + Arrays.toString(arrayInput));
            System.out.println("Select actions on the array");
            System.out.println("1 - Search for a number by value in an array");
            System.out.println("2 - Sort the entered array");
            System.out.println("3 - Exit the program");

            int selection = 0;

            try {
                selection = inputIntNumbers();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (selection) {

                case 1:
                    findIntInArray(arrayInput);
                    break;

                case 2:
                    Arrays.sort(arrayInput);
                    System.out.print("Sorted array: " + Arrays.toString(arrayInput));
                    break;

                case 3:
                    break;

                default:
                    System.err.println("Wrong selection");
                    break;
            }
        } else {
            System.err.println("Invalid length of array");
        }
    }

    private static void findIntInArray(int array[]) {

        System.out.println("Enter the required number");

        int requiredNumber = 0;

        try {
            requiredNumber = inputIntNumbers();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int countOfRequiredNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            if (requiredNumber == array[i]) {
                countOfRequiredNumbers++;
                System.out.println("find in position " + i);
            }
        }

        if (countOfRequiredNumbers > 0) {
            System.out.println("The entered number occurs " + countOfRequiredNumbers + " time");
        } else {
            System.out.println("The entered number is absent in the array");
        }
    }

}
