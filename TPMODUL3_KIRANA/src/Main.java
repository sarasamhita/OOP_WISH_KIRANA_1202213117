import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant resto = new Restaurant();
            int orderQty, customerID;
            try {
                System.out.println("Enter Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Enter how much food to make: ");
                orderQty = input.nextInt();

                Thread one = new Thread(resto);
                Waiters waiters = new Waiters(orderQty, customerID);
                Thread two = new Thread(waiters);

                one.start();
                two.start();
                one.join();
                two.join();

            } catch (Exception e) {
                System.out.println("Input must be in Integer");
            }
        }
    }
}
