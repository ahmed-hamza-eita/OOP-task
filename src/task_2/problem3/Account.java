package task_2.problem3;

public class Account {
    private String id, name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance = amount + balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance - amount;
        } else {
            System.out.println("Amount exceeded to balance");
        }
        return balance;
    }

    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            return anotherAccount.balance = amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public void showDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);

    }
}
