import java.util.Scanner;


public class LeapYear {
    private int year;
    private boolean leap = false;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            leap = true;
        }
        else {
            leap = false;
        }
        return leap;
    }

}
