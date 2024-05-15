package tgs_Pmln6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Employee registration number:");
        int registrationNumber = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter Employee name:");
        String nama = scn.nextLine();

        System.out.println("Enter Employee salary per month:");
        int salaryPerMonth = scn.nextInt();
        scn.nextLine();

        System.out.println("===============================");
        System.out.println("------------ Welcome --------------------");
        System.out.println("===============================");
        System.out.println("Enter number of invoices:");
        int numOfInvoices = scn.nextInt();
        scn.nextLine();

        invoice[] invoices = new invoice[numOfInvoices];
        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("\nEnter details for invoice " + (i + 1));
            System.out.println("Product Name:");
            String produkName = scn.nextLine();
            System.out.println("Quantity:");
            int quantity = scn.nextInt();
            scn.nextLine();

            System.out.println("Price per Item:");
            double pricePerItem = scn.nextDouble();
            scn.nextLine();

            invoices[i] = new invoice(produkName, quantity, pricePerItem);
        }

        employee employee = new employee(registrationNumber, nama, salaryPerMonth, invoices);
        employee.displayEmployeeInfo();
        System.out.println("\nTotal Salary after deductions: " + employee.getPaymentAmount());
        employee.displayInvoiceDetails();
    }
}
