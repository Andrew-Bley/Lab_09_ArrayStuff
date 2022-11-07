import java.util.Scanner;

public class SafeInput {

    /**
     * get an integer value withing a specified range of low - high
     *
     * @param pipe   scanner to use for console input
     * @param prompt String that tells the user what to input
     * @param low    low value for a range low - high
     * @param high   high value for a range
     * @return an int value within the low - high range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = low - 1;

        String trash = "";
        boolean done = false;


        do {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= 1 && retVal <= 100) {
                    System.out.println("\nYou said your value is " + retVal);
                    done = true;
                } else {
                    System.out.println("Your number is out of range or not an integer " + trash);
                }

            }

        } while (!done);

        return retVal;

    }
}

