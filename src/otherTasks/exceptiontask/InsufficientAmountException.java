package otherTasks.exceptiontask;

public class InsufficientAmountException extends Exception {
    private double amount;
    public InsufficientAmountException(double needs) {
        this.amount = needs;
    }

    @Override
    public String getMessage() {
        return "Sorry, but you are short $"+amount;
    }

    public String getAmount() {
        return ""+amount;

    }
}
