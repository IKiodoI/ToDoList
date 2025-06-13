import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n--- Java To-Do List ---");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manager.viewTasks();
                    break;
                case "2":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    manager.addTask(task);
                    break;
                case "3":
                    manager.viewTasks();
                    System.out.print("Enter task number to remove: ");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.removeTask(index);
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
