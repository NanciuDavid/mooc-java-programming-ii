
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type " +(char)34 +"end"+(char)34+" to stop");
        while(true) {
            String command = scanner.nextLine();

            if(command.equals("end")) {
                break;
            }

            int value = Integer.parseInt(command);
            numbers.add(value);
        }
        double average = numbers.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();

        System.out.println("average of the numbers : "+ average);
    }
   
}