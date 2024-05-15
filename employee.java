package tgs_Pmln6;

import java.util.Arrays;

public class employee implements payable {
    int registrationNumber;
    String nama;
    int salaryPerMonth;
    invoice[] invoices;

    public employee(int registrationNumber, String nama, int salaryPerMonth, invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.nama = nama;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPaymentAmount() {
        double totalBelanjaan = 0;
        for (invoice invoice : invoices) {
            totalBelanjaan += invoice.getPaymentAmount();
        }
        return salaryPerMonth - totalBelanjaan;
    }

    public void displayInvoiceDetails() {
        System.out.println("\n========= Invoice Details =========");
        double totalBelanjaan = 0;
        for (invoice invoice : invoices) {
            double paymentAmount = invoice.getPaymentAmount();
            totalBelanjaan += paymentAmount;
            System.out.println("\nProduk\t: " + invoice.produkName +
                    "\nJumlah\t: " + invoice.quantity +
                    "\nHarga\t: " + invoice.pricePerItem +
                    "\nTotal\t: " + paymentAmount);
        }
        System.out.println("\nTotal Belanjaan\t: " + totalBelanjaan);
    }

    public void displayEmployeeInfo() {
        System.out.println("\n================ Employee Info ================");
        System.out.println("Registration Number\t: " + registrationNumber +
                "\nName\t\t\t: " + nama +
                "\nSalary per Month\t: " + salaryPerMonth);
    }
}
