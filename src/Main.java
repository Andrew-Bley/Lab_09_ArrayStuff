import java.io.StringReader;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[100];
        Random gen = new Random();
        for (int l = 0; l < values.length; l++)
            values[l] = gen.nextInt(100) + 1;

        for (int l = 0; l < values.length; l++)
            System.out.printf("%3d", values[l]);

        int sum = 0;
        for (int l = 0; l < values.length; l++)
            sum += values[l];

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / values.length);
        System.out.println("The sum is " + sum);

        int[] values1 = new int[100];
        Random gen1 = new Random();




        Scanner in = new Scanner(System.in);


        int target = SafeInput.getRangedInt(in, "Enter your value : ", 1, 100);

        int itemCount = 0;



        itemCount++;

        for (int l = 0; l < values.length; l++)
            values[l] = gen.nextInt(100) + 1;

        for (int l = 0; l < values.length; l++)
            System.out.printf("%4d", values[l]);


        int sum1 = 0;

        for (int l = 0; l < values.length; l++)
            sum += values[l];


        System.out.println("\nThe sum of the array values is " + sum);
        System.out.println("\nThe average is " + sum / values.length);


        boolean found = false;
        for (int t = 0; t < values.length; t++) {
            if (values[t] == target) {
                System.out.println("Your value was found at " + t);
                found = true;
            }
        }
        System.out.println("Finished the search");
        if (!found)
            System.out.println("Did not find the values " + target);


        found = false;

    }

}


