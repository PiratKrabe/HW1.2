import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Linkin on 12.06.2017.
 */
public class Test {
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


    public static void main(String[] args) throws Exception {
        System.out.println("Enter size of array");
        int arraySize = inputIntNumbers();
        if (arraySize > 0) {
            int arrayInput[] = new int[arraySize];
            int indexOfArray = 0;
            while (indexOfArray < arrayInput.length) {
                System.out.println("Enter " + (indexOfArray + 1) + " element of the array");
                arrayInput[indexOfArray] = inputIntNumbers();
                indexOfArray++;
            }
            System.out.println("Initial array: " + Arrays.toString(arrayInput));
            System.out.println("Select actions on the array");
            System.out.println("1 - Search for a number by value in an array");
            System.out.println("2 - Sort the entered array");
            System.out.println("3 - Exit the program");
            int selection = inputIntNumbers();
            switch (selection) {
                case 1:
                    System.out.println("Enter the required number");
                    int requiredNumber = inputIntNumbers();
                    int countOfRequiredNumbers = 0;
                    for (int i = 0; i < arrayInput.length; i++) {
                        if (requiredNumber == arrayInput[i]) {
                            countOfRequiredNumbers++;
                            System.out.println("find in position " + i);
                        }
                    }
                    if (countOfRequiredNumbers > 0) {
                        System.out.println("The entered number occurs " + countOfRequiredNumbers + " time");
                    } else {
                        System.out.println("The entered number is absent in the array");
                    }
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
}
