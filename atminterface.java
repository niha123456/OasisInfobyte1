import java.util.Scanner;

public class ATMInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] user = { 100,101,102,103,104,105,106,107,108,109 };
        int[] pin = { 2000,2001,2002,2003,2004,2005,2006,2007,2008,2009 };
        int[] savings = { 50000,60000,70000,80000,90000,100000,110000,120000,130000,150000 };
        int attempt = 1, a = 0, b = 0, withdraws, deposits;
        try {
            System.out.println("Enter your user ID:");
            int userid = sc.nextInt();
            for (int i = 0; i < 10; i++) {
                if (userid != user[i]) {
                    attempt++;
                } else {
                    b = i;
                    attempt = 1;
                    break;
                }
            }
            if (attempt > 1) {
                System.out.println("Invalid User ID");
                return;
            }
            System.out.println("Welcome " + userid + " for ATM services.");
            System.out.println("Enter your PIN:");
            int password = sc.nextInt();
            if (password != pin[n]) {
                while (true) {
                    System.out.println("Entered PIN is incorrect.");
                    attempt++;
                    System.out.println("Re-enter your pin: ");
                    password = sc.nextInt();
                    if (password == pin[n]) {
                        break;
                    }
                    if (attempt >= 3) {
                        System.out.println("You've exceeded the limit. Please try again after some time.");
                        return;
                    }
                }
            }
            System.out.println();
            System.out.println("Choose your task.");
            System.out.println("1. Balance enquiry");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transaction");
            System.out.println("5. quit");
            System.out.println();
            System.out.println("Enter your option :");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Transaction History");
                    System.out.println("Your current balance is:" + b[n]);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    withdraws = sc.nextInt();
                    if (withdraws > savings[n] || savings[n] == 0) {
                        System.out.println("Insufficient funds.");
                        System.out.println();
                        break;
                    }
                    System.out.println("Withdraw processed.");
                    savings[n] = savings[n] - withdraws;
                    System.out.println("Your current balance is:" + savings[n]);
                    break;
                case 3:
                    System.out.println("Enter amount to deposit:");
                    deposits = sc.nextInt();
                    savings[n] = savings[n] + deposits;
                    System.out.println("Your amount is deposited successfully.");
                    System.out.println("Your current balance is:" + savings[n]);
                    break;
                case 4:
                    System.out.println("Enter the user ID to which you want to transfer the amount");
                    int uid = sc.nextInt();
                    for (int i = 0; i < 10; i++) {
                        if (uid != user[i]) {
                            attempt++;
                        } else {
                            a = i;
                            attempt = 1;
                            break;
                        }
                    }
                    if (attempt > 1) {
                        System.out.println("Invalid User ID");
                        return;
                    }
                    System.out.println("Enter the amount that you would like to transfer");
                    int amount = sc.nextInt();
                    savings[n] = savings[n] - amount;
                    savings[m] = savings[m] + amount;
                    System.out.println("Your current balance after transaction is:" + b[n]);
                    break;
                case 5:
                    System.out.println("ThankYou for utilising ATM services.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Option. Try again!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
