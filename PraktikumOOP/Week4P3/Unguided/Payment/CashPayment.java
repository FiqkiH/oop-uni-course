package PraktikumOOP.Week4P3.Unguided.Payment;

public class CashPayment extends Payment {
    
    public CashPayment (double amount) {
        super(amount);
    }

    public void Pay() {
        super.Pay();
        System.out.println("Pembayaran Tunai sebesar Rp. " + getAmount());
    }
}
