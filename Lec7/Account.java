import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private String customerName; // New data field for Account1
    private ArrayList<Transaction> transactions; // New data field

    public Account() {
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    // Nested class Account1
    public class Account1 {
        public Account1(String customerName, int newId, double newBalance) {
            id = newId;
            balance = newBalance;
            dateCreated = new Date();
            Account.this.customerName = customerName;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            Account.this.customerName = customerName;
        }
    }

    // Transaction class
    private class Transaction {
      private char type;
      private double amount;
      private double balance;
      private String description;
  
      public Transaction(char type, double amount, double balance, String description) {
          this.type = type;
          this.amount = amount;
          this.balance = balance;
          this.description = description;
      }
  
      // Getter methods
      public char getType() {
          return type;
      }
  
      public double getAmount() {
          return amount;
      }
  
      public double getBalance() {
          return balance;
      }
  
      public String getDescription() {
          return description;
      }

      public Date getDateCreated() {
        return Account.this.dateCreated;
    }
  }
  

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }



    public static class TestAccount {
        public static void main(String[] args) {
            // Create an account with annual interest rate 1.65%, balance 1000, id 1122, and name George
            Account account = new Account(1122, 1000);
            account.setAnnualInterestRate(1.6);
            account.setCustomerName("George");
    
            // Deposit $30, $40, and $50 to the account
            account.deposit(30);
            account.deposit(40);
            account.deposit(50);
    
            // Withdraw $5, $4, $2 from the account
            account.withdraw(5);
            account.withdraw(4);
            account.withdraw(2);
    
            // Print account summary
            System.out.println("Name: " + account.customerName);
            System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
            System.out.println("Balance: " + account.getBalance());
    
            // Print transactions
            System.out.printf("%-30s %-10s %-10s %-10s\n", "Date", "Type", "Amount", "Balance");
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            for (Account.Transaction transaction : account.transactions) {
                System.out.printf("%-30s %-10s %-10.1f %-10.1f\n",
                        dateFormat.format(transaction.getDateCreated()),
                        (transaction.getType() == 'D' ? "D" : "W"),
                        transaction.getAmount(),
                        transaction.getBalance());
            }
        }
    }
    
}
