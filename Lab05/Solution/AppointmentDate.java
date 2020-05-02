/**
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class AppointmentDate {
    private int day, month, year;

    public AppointmentDate() {
        day = 1;
        month = 1;
        year = 1970;
    }

    public AppointmentDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            // Use "this" to differentiate instance variables
            // from local variables
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Not valid input");
            System.exit(0);
        }
    }

    private boolean isValidDate(int day, int month, int year) {
        // TODO
        return true;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
