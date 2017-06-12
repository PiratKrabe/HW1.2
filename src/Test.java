import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Linkin on 12.06.2017.
 */
public class Test {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int [] n = new int[5];
        for (int i = 0; i <n.length; i++) {
            System.out.println("Enter numbers to array ");
            n[i] = reader.nextInt();
        }
        String s = Arrays.toString(n);
        System.out.println("Not sorted array : " + s);
        Arrays.sort(n);
        String res = Arrays.toString(n);
        System.out.println("Sorted arrays :" + res);

    }
}