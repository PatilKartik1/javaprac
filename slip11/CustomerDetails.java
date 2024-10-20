// Q2. Write a program to accept details of 'n' customers (c_id, cname, address, mobile_no) from
// user and store it in a file using DataOutputStream class.

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CustomerDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "customer_details.txt";

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName))) {
            System.out.print("Enter the number of customers: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Customer " + (i + 1));

                System.out.print("Enter Customer ID: ");
                int c_id = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter Customer Name: ");
                String cname = scanner.nextLine();

                System.out.print("Enter Address: ");
                String address = scanner.nextLine();

                System.out.print("Enter Mobile Number: ");
                long mobile_no = scanner.nextLong();

                // Writing customer details to file
                dataOut.writeInt(c_id);
                dataOut.writeUTF(cname);
                dataOut.writeUTF(address);
                dataOut.writeLong(mobile_no);
            }

            System.out.println("Customer details have been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
