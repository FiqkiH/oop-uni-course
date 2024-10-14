package PraktikumOOP.Week4P3.Unguided;

public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void Pay() {
        System.out.println("Pembayaran sedang diproses Rp. " + amount);
    }
}
