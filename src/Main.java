import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6", "7"};
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the task number:");
            String s = scanner.nextLine();
            if (s.equals("1")) {
                System.out.print("Enter the current exchange rate of the dollar to the hryvnia\n: ");
                double rate = scanner.nextDouble();
                Task1 first = new Task1();
                System.out.println(first.task1(rate));
            } else if (s.equals("2")) {
                System.out.print("Enter the value n: ");
                int n = scanner.nextInt();
                Task2 second = new Task2();
                System.out.println(second.task2(n));
            } else if (s.equals("3")) {
                System.out.println("Enter the number of numbers:");
                int n = scanner.nextInt();
                Task3 third = new Task3();
                System.out.println(third.task3(n, scanner));
            } else if (s.equals("4")) {
                System.out.println("enter n integers and the last 0:");
                int n = scanner.nextInt();
                Task4 fourth = new Task4();
                System.out.println(fourth.task4(n, scanner));
            } else if (s.equals("5")) {
                System.out.println("Enter the value n:");
                int n = scanner.nextInt();
                System.out.println("Enter a sequence of numbers:");
                int num = scanner.nextInt();
                Task5 fifth = new Task5();
                System.out.println(fifth.task5(num, n, scanner));
            } else if (s.equals("6")) {
                System.out.println("Enter the number of grades n:");
                int n = scanner.nextInt();
                Task6 sixth = new Task6();
                System.out.println(sixth.task6(n, scanner));
            } else {
                System.exit(0);
            }
        }
    }
}
