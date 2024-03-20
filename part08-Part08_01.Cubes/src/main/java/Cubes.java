
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");

    while(true) {
        String command = scanner.nextLine();
        if(command.equals("end")) {
            System.out.println("end");
            break;
        } else{
            System.out.println((int)Math.pow(Integer.valueOf(command), 3));
        }

    }

    scanner.close();
    }
}
