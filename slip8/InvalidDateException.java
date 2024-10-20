// Q2. Define a class MyDate (day, month, year) with methods to accept and display MyDate object.
// Accept date as dd, mm, yyyy. Throw user defined exception "InvalidDateException" ifthe date
// is invalid. Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001
// [20 Marks]

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day, month, year;

    // Constructor
    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to check if the date is valid
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }

        // Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        // Validate day range
        return day > 0 && day <= daysInMonth[month - 1];
    }

    // Method to check if it's a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Display the date
    public void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        try {
            MyDate date = new MyDate(12, 15, 2015); // Invalid date
            date.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }

        try {
            MyDate validDate = new MyDate(31, 12, 2020); // Valid date
            validDate.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
