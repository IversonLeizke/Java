package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showDate() {
        System.out.printf("The date is %d/%d/%d.", day, month, year);
    }
}