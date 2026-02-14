package week03.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

  
        Invoice invoice = new Invoice("P101", "Electric Drill", 3, 150.75);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        System.out.println("\n--- Testing validation ---");

        invoice.setQuantity(-5);
        invoice.setPricePerItem(-200);

        System.out.println("Quantity after invalid set: " + invoice.getQuantity());
        System.out.println("Price after invalid set: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount after invalid set: " + invoice.getInvoiceAmount());
    }
}
