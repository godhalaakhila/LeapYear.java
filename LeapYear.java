public class LeapYear {

    public static void main(String[] args) {
        // Define a year (you can change this year to test different years)
        int year = 2024;

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
 
    

