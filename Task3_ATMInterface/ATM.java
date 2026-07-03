package Task3_ATMInterface;

import java.util.Scanner;

public class ATM {

    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n========== ATM ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance : ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount : ₹");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount : ₹");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank You for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

    }

}