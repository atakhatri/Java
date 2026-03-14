class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String msg) {
        super(msg);
    }
}

public class BankAccount {
    public static void withdraw(int bal, int amt) {
        if(amt > bal) {
            throw new NegativeBalanceException("insufficient balance !!");
        } else {
            System.out.println("withdrawal successful. rem. balance : " + (bal - amt));
        }
    }

    public static void main(String[] args) {
        withdraw(10000, 15000);
    }
}
