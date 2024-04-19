
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class LimitedNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();

        while(true) {
            Integer value = scanner.nextInt();

            if(value < 0){
                break;
            }

            values.add(value);
        }

        List<Integer> valuesFiltered = values.stream().filter(value -> (value >= 1 && value <=5)).collect(Collectors.toList());
        valuesFiltered.forEach(value -> System.out.println(value));

    }

}
