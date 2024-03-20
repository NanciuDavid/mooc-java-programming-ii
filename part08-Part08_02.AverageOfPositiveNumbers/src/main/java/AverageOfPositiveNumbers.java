
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mean = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (list.size() == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    break;
                }
            } else if (number > 0) {
                list.add(number);
            }

        }
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        mean = 1.0 * sum / list.size();
        if (mean != 0) {
            System.out.println(mean);
        }
    }
}
