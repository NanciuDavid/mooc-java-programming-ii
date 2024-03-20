
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        String[] parts = { null };

        while (true) {
            System.out.println("First: "+firstContainer);
            System.out.println("Second: "+secondContainer);

            String command = scan.nextLine();
            parts = command.split(" ");

            if (parts[0].equals("quit")) {
                break;
            }

            String action = parts[0];
            int value = Integer.valueOf(parts[1]);
            switch (action) {
                case "add":
                    firstContainer.add(value);
                    break;

                case "remove":
                    secondContainer.remove(value);
                    break;

                case "move":
                    if(firstContainer.contains() < value) {
                        secondContainer.setCapacity(firstContainer.contains());
                        firstContainer.setCapacity(0);
                        continue;
                    } else {
                    firstContainer.remove(value);
                    secondContainer.add(value);
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
