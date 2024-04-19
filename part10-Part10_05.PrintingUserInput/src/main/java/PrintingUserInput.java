
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>words = new ArrayList<>();
        

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("")) {
                break;
            }

            words.add(input);

        }

        String wordsString = words.stream().reduce("", (previousString, wordsInArray) -> previousString + wordsInArray + "\n");
        System.out.println(wordsString);
    }

}
