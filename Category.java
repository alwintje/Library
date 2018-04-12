
/**
 * @author Group 10
 * @version 1
 */
public class Category {
    private String name;
    private Double price;
    private double penaltyPeriodPrice;
    private int penaltyDaysPeriod;
    private int borrowDaysLimit;


    public Category(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getPenaltyPeriodPrice() {
        return penaltyPeriodPrice;
    }

    public void setPenaltyPeriodPrice(double price) {
        this.penaltyPeriodPrice = price;
    }

    public int getPenaltyDaysPeriod() {
        return penaltyDaysPeriod;
    }

    public void setPenaltyDaysPeriod(int period) {
        this.penaltyDaysPeriod = period;
    }

    public int getBorrowDaysLimit() {
        return borrowDaysLimit;
    }

    public void setBorrowDaysLimit(int limit) {
        this.borrowDaysLimit = limit;
    }
}
