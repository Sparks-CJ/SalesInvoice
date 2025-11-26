import java.util.Scanner;

public class SalesInvoice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------------------- BILL TO INFORMATION --------------------
        System.out.println("Enter Bill To Name:");
        String billName = sc.nextLine();

        System.out.println("Enter Bill To Address:");
        String billAddress = sc.nextLine();

        System.out.println("Enter Bill To GSTIN:");
        String billGstin = sc.nextLine();

        System.out.println("Enter Bill To Contact:");
        String billContact = sc.nextLine();

        System.out.println("Enter Bill To Email:");
        String billEmail = sc.nextLine();

        // -------------------- SHIP TO INFORMATION --------------------
        System.out.println("\nEnter Ship To Name:");
        String shipName = sc.nextLine();

        System.out.println("Enter Ship To Address:");
        String shipAddress = sc.nextLine();

        System.out.println("Enter Ship To GSTIN:");
        String shipGstin = sc.nextLine();

        System.out.println("Enter Ship To Contact:");
        String shipContact = sc.nextLine();

        System.out.println("Enter Ship To Email:");
        String shipEmail = sc.nextLine();

        // -------------------- PRODUCT 1 --------------------
        System.out.println("\nEnter Product 1 Code:");
        int p1code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 1 Name:");
        String p1name = sc.nextLine();

        System.out.println("Enter Product 1 HSN:");
        String p1hsn = sc.nextLine();

        System.out.println("Enter Product 1 Quantity:");
        int p1qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 1 Units:");
        String p1units = sc.nextLine();

        System.out.println("Enter Product 1 Rate:");
        double p1rate = sc.nextDouble();

        System.out.println("Enter Product 1 Tax %:");
        double p1tax = sc.nextDouble();

        double a1 = p1qty * p1rate;

        // -------------------- PRODUCT 2 --------------------
        System.out.println("\nEnter Product 2 Code:");
        int p2code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 2 Name:");
        String p2name = sc.nextLine();

        System.out.println("Enter Product 2 HSN:");
        String p2hsn = sc.nextLine();

        System.out.println("Enter Product 2 Quantity:");
        int p2qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 2 Units:");
        String p2units = sc.nextLine();

        System.out.println("Enter Product 2 Rate:");
        double p2rate = sc.nextDouble();

        System.out.println("Enter Product 2 Tax %:");
        double p2tax = sc.nextDouble();

        double a2 = p2qty * p2rate;

        // -------------------- PRODUCT 3 --------------------
        System.out.println("\nEnter Product 3 Code:");
        int p3code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 3 Name:");
        String p3name = sc.nextLine();

        System.out.println("Enter Product 3 HSN:");
        String p3hsn = sc.nextLine();

        System.out.println("Enter Product 3 Quantity:");
        int p3qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 3 Units:");
        String p3units = sc.nextLine();

        System.out.println("Enter Product 3 Rate:");
        double p3rate = sc.nextDouble();

        System.out.println("Enter Product 3 Tax %:");
        double p3tax = sc.nextDouble();

        double a3 = p3qty * p3rate;

        // -------------------- PRODUCT 4 --------------------
        System.out.println("\nEnter Product 4 Code:");
        int p4code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 4 Name:");
        String p4name = sc.nextLine();

        System.out.println("Enter Product 4 HSN:");
        String p4hsn = sc.nextLine();

        System.out.println("Enter Product 4 Quantity:");
        int p4qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 4 Units:");
        String p4units = sc.nextLine();

        System.out.println("Enter Product 4 Rate:");
        double p4rate = sc.nextDouble();

        System.out.println("Enter Product 4 Tax %:");
        double p4tax = sc.nextDouble();

        double a4 = p4qty * p4rate;

        // -------------------- PRODUCT 5 --------------------
        System.out.println("\nEnter Product 5 Code:");
        int p5code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 5 Name:");
        String p5name = sc.nextLine();

        System.out.println("Enter Product 5 HSN:");
        String p5hsn = sc.nextLine();

        System.out.println("Enter Product 5 Quantity:");
        int p5qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 5 Units:");
        String p5units = sc.nextLine();

        System.out.println("Enter Product 5 Rate:");
        double p5rate = sc.nextDouble();

        System.out.println("Enter Product 5 Tax %:");
        double p5tax = sc.nextDouble();

        double a5 = p5qty * p5rate;

        // -------------------- PRODUCT 6 --------------------
        System.out.println("\nEnter Product 6 Code:");
        int p6code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 6 Name:");
        String p6name = sc.nextLine();

        System.out.println("Enter Product 6 HSN:");
        String p6hsn = sc.nextLine();

        System.out.println("Enter Product 6 Quantity:");
        int p6qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 6 Units:");
        String p6units = sc.nextLine();

        System.out.println("Enter Product 6 Rate:");
        double p6rate = sc.nextDouble();

        System.out.println("Enter Product 6 Tax %:");
        double p6tax = sc.nextDouble();

        double a6 = p6qty * p6rate;

        // -------------------- PRODUCT 7 --------------------
        System.out.println("\nEnter Product 7 Code:");
        int p7code = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 7 Name:");
        String p7name = sc.nextLine();

        System.out.println("Enter Product 7 HSN:");
        String p7hsn = sc.nextLine();

        System.out.println("Enter Product 7 Quantity:");
        int p7qty = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product 7 Units:");
        String p7units = sc.nextLine();

        System.out.println("Enter Product 7 Rate:");
        double p7rate = sc.nextDouble();

        System.out.println("Enter Product 7 Tax %:");
        double p7tax = sc.nextDouble();

        double a7 = p7qty * p7rate;

        // -------------------- TOTAL CALCULATIONS --------------------
        double subtotal = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        double discount = subtotal * 0.006368; // 0.6368%
        double grandTotal = subtotal - discount;

        // -------------------- FINAL OUTPUT --------------------
        System.out.println("\n\n");
        System.out.println("Bill To:");
        System.out.println(billName);
        System.out.println(billAddress);
        System.out.println("GSTIN: " + billGstin);
        System.out.println("Contact: " + billContact);
        System.out.println("Email: " + billEmail);

        System.out.println("\nShip To:");
        System.out.println(shipName);
        System.out.println(shipAddress);
        System.out.println("GSTIN: " + shipGstin);
        System.out.println("Contact: " + shipContact);
        System.out.println("Email: " + shipEmail);

        System.out.println("\nPayment Date: 7 days from date of delivery");
        System.out.println("Payment Terms: 100% against invoice\n");

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-3s | %-11s | %-20s | %-10s | %-8s | %-5s | %-8s | %-4s | %-8s%n",
                "SNo", "Product Code", "Product Name", "HSN code", "Quantity", "Units", "Rate", "Tax", "Amount");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                1, p1code, p1name, p1hsn, p1qty, p1units, p1rate, p1tax, a1);
        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                2, p2code, p2name, p2hsn, p2qty, p2units, p2rate, p2tax, a2);
        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                3, p3code, p3name, p3hsn, p3qty, p3units, p3rate, p3tax, a3);
        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                4, p4code, p4name, p4hsn, p4qty, p4units, p4rate, p4tax, a4);
        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                5, p5code, p5name, p5hsn, p5qty, p5units, p5rate, p5tax, a5);
        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                6, p6code, p6name, p6hsn, p6qty, p6units, p6rate, p6tax, a6);
        System.out.printf("%-3d | %-11d | %-20s | %-10s | %-8d | %-5s | %-8.2f | %-4.1f%% | %-8.2f%n",
                7, p7code, p7name, p7hsn, p7qty, p7units, p7rate, p7tax, a7);

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-70s %.2f%n", "Subtotal", subtotal);
        System.out.printf("%-70s %.2f%n", "Discount (0.6368%)", discount);
        System.out.printf("%-70s %.2f%n", "Grand Total", grandTotal);

        sc.close();
    }
}
