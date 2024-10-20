// Q1. Write a program create class as MyDate with dd,mm,yy as data members. Write
// parameterized constructor. Display the date in dd-mm-yy format. (Use this keyword)

public class MyDate {
    // Data members for day, month, year
    private int dd;
    private int mm;
    private int yy;

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd; // Using 'this' keyword to differentiate between local and instance variables
        this.mm = mm;
        this.yy = yy;
    }

    // Method to display the date in dd-mm-yy format
    public void displayDate() {
        System.out.println(this.dd + "-" + this.mm + "-" + this.yy);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of MyDate and initializing through constructor
        MyDate date = new MyDate(19, 10, 2024);
        
        // Displaying the date in dd-mm-yy format
        date.displayDate();
    }
}
