package P08ExceptionsAndErrorHandling.P01NumberInRange;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Range: [" + range[0] + "..." + range[1] + "]");

        boolean isValid=false;

        while (!isValid){
            String nextInput = scanner.nextLine();

            try{
                int number = Integer.parseInt(nextInput);
                if (isInRange(range,number)){
                    System.out.println("Valid number: " + number);
                    isValid=true;
                    break;
                }
            } catch (NumberFormatException ignored){
            }
            System.out.println("Invalid number: " + nextInput);
        }
    }

    private static boolean isInRange(int[] range, int number){
        return number>=range[0] && number<=range[1];
    }
}
