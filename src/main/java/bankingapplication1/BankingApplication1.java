package bankingapplication1;

import java.util.Random;
import java.util.Scanner;

public class BankingApplication1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String accountNeme = "";
        int option = 0, accountNumber = 0;
        double amount = 0 , balance = 0;
        Bank bank = new Bank("Promt");

        while (option != 6){
            System.out.println("Main Menu");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Open New Account");
            System.out.println("3. Close Existing Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            scan.nextLine();

            switch(option){
                case 1:
                    bank.listAccounts();
                    break;
                case 2:
                    accountNumber = genAccountNumber();
                    System.out.print("Enter account name: ");
                    accountNeme = scan.nextLine();
                    System.out.print("Enter account balance: ");
                    balance = scan.nextDouble();
                    bank.openAccount(accountNumber, accountNeme,balance);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    bank.closeAccount(accountNumber);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter amount: ");
                    amount = scan.nextDouble();
                    bank.depositMoney(accountNumber, amount);
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter amount: ");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(accountNumber, amount);
                    break;
            }
            System.out.println();
        }
    }
    public static int genAccountNumber(){
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
}