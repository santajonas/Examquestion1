import java.util.Comparator;
import java.util.Objects;

public class Date {

    private int day;
    private int month;
    private int year;
    //
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //
    public Date()
    {
        this.day = 7;
        this.month = 8;
        this.year = 2018;
    }
    //
    public void setDate(int day,int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //
    public Date copy(){
        return new Date(day,month,year);
    }
    //


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    //Skulle der ikke være sådan en metode her?
    public boolean isAfter(Date date) {
        //testing if day is after
        if(this.getYear() >= date.getYear() && this.getMonth() >= date.getMonth() && this.getDay() > date.getDay()) return true;
        //test if month is after
        if(this.getYear() >= date.getYear() && this.getMonth() > date.getMonth()) return true;
        //testing if year is after
        if(this.getYear() > date.getYear()) return true;
        return false;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}
