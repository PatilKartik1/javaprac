// Q2. Create a package "utility". Define a class CapitalString under "utility" package which will
// contain a method to return String with first letter capital. Create a Person class (members — name,
// city) outside the package. Display the person name with first letter as capital by making use of
// CapitalString.
// [20 Marks]

// File: utility/CapitalString.java
package utility;

public class CapitalString {
    // Method to capitalize the first letter of a given string
    public String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str; // return as is if string is null or empty
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
/******************************************/

// File: Person.java
import utility.CapitalString;

public class Person {
    private String name;
    private String city;

    // Constructor
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Method to display person's details
    public void displayDetails() {
        CapitalString capitalizer = new CapitalString();
        String capitalizedName = capitalizer.capitalizeFirstLetter(name);
        System.out.println("Name: " + capitalizedName);
        System.out.println("City: " + city);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Person person = new Person("john doe", "New York");
        person.displayDetails(); // This will display the name with the first letter capitalized
    }
}


