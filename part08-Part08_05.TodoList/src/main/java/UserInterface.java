import java.util.Scanner;


public class UserInterface{
    private TodoList toDoList;
    private Scanner scanner = new Scanner(System.in);

    public  UserInterface(TodoList list, Scanner scanner){
        this.toDoList = list;
        this.scanner = scanner;
    }
    public void start() {
    while(true)
    {
        System.out.print("Command:");
        String command = scanner.nextLine();

        switch (command) {
            case "add":
                System.out.print("To add:");
                String task = scanner.nextLine();
                    toDoList.add(task);
                break;

            case "list":
                toDoList.print();
                break;

            case "remove":
                System.out.print("Which one is removed?:");
                int number = Integer.valueOf(scanner.nextLine());
                toDoList.remove(number);
                break;

            case "stop":
                return;
            default:
                break;
        }

    }
}
}
