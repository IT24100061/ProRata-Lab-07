import java.util.Scanner;

public class IT24100061Lab7Q3 {
    public static void main(String[] args) {

       int customer;
	   double billAmount, discount, amountToPay;
	   char mode;
	   
	   Scanner input = new Scanner(System.in);
	   
	   for(customer=1;customer<=5;customer++)
	   {
	     System.out.println("Customer " + customer);
         System.out.print("Enter total bill amount: ");
		 billAmount = input.nextDouble();
		 
		 System.out.print("Enter mode of payment (C for cash, O for other): ");
         mode = input.next().charAt(0);
		 
		  if (mode == 'C' || mode == 'c') {
                discount = billAmount * 0.05;
                amountToPay = billAmount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}