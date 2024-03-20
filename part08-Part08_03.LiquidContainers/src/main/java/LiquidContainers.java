
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxValue = 100;
        int firstContainer = 0 ;
        int secondContainer = 0;

        while (true) {

            System.out.println("");
            System.out.println("First: " +firstContainer + "/" + maxValue);
            System.out.println("Second: "+secondContainer + "/" + maxValue);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "add": 

                    if(Integer.valueOf(parts[1]) > 0 && firstContainer+Integer.valueOf(parts[1]) < maxValue) {
                        firstContainer+=Integer.valueOf(parts[1]);
                        continue;
                    }
                    if(firstContainer+Integer.valueOf(parts[1]) >= maxValue) {
                        firstContainer = maxValue;
                        continue;
                    }
                    break;
            

                case "move": 
                    
                    int value = Integer.valueOf(parts[1]);

                    if(firstContainer - value > 0 && value > 0) {
                        firstContainer-=value;
                        secondContainer+=value;
                        if(secondContainer > maxValue) {
                            secondContainer = maxValue;
                        }
                        continue;
                    }

                    if(firstContainer - value <= 0 && firstContainer > 0 && value > 0) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                        if(secondContainer > maxValue) {
                            secondContainer = maxValue;
                        }
                        continue;
                    }


                case "remove":

                    int valueToRemove = Integer.valueOf(parts[1]);
                    
                    if(secondContainer == 0) {
                        continue;
                    }
                    if(valueToRemove >= secondContainer) {
                        secondContainer = 0;
                        continue;
                    }
                    if(valueToRemove <secondContainer) {
                        secondContainer -= valueToRemove;
                        continue;
                    }
                    break;
                default:
                    break;
            }


        }
    }

}
