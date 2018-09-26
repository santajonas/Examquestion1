public class Service {

    private int mileage;
    private Date date;

    public Service(int mileage, Date date) {
        this.mileage = mileage;
        this.date = date;
    }
    public int getMileage(){
        return mileage;
    }

    public Date getDate() {
        return date.copy();
    }

    @Override
    public String toString() {
        return "Service{" +
                "mileage=" + mileage +
                ", date=" + date +
                '}';
    }
}


