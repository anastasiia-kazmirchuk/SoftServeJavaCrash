package otherTasks.exceptiontask;

//The output of the doOperations invocation looks like this:
//Sorry, but you are short $200.0
//Please, deposit at least $200.0
//     **standard stack trace output**

public class BankDemo {
    public static void main(String[] args) {
        doOperations();
    }

    public static void doOperations() {
        CheckingAccount c = new CheckingAccount(101);
        c.deposit(500.00);
        try {
            c.withdraw(100.00);
            c.withdraw(600.00);
        } catch (InsufficientAmountException e) {
            System.out.println(e.getMessage());
            System.out.println("Please, deposit at least $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
