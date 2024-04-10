
import java.io.IOError;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        System.out.println("Input numbers, type " + (char)34 + "end" + (char)34 +" to stop");

        while(true) {

            String value = scanner.nextLine();
            if(value.equals("end")) break;
            
            values.add(Integer.parseInt(value));
        }
        
        double avgNeg = values.stream().mapToInt(s -> Integer.valueOf(s)).filter(value -> value < 0).average().getAsDouble();

        double avgPos= values.stream().mapToInt(s -> Integer.valueOf(s)).filter(value -> value > 0).average().getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        try {
            if (choice != null) { // Check if choice is not null
                if (choice.equals("p")) {
                    System.out.println("Average of the positive numbers: " + avgPos);
                } else if (choice.equals("n")) {
                    System.out.println("Average of the negative numbers: " + avgNeg);
                } else {
                    System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Invalid choice");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice");
        }
        
    }  
}
