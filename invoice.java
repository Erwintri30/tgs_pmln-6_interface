package tgs_Pmln6;

public class invoice implements payable {
    String produkName;
    int quantity;
    double pricePerItem;

    public invoice(String produkName, int quantity, double pricePerItem) {
        this.produkName = produkName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}
