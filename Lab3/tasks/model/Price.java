package tasks.model;

import java.util.Date;

public class Price implements Cloneable {
    private Double price;
    private Date startFrom;
    private Date endFrom;

    public  Price() {}

    public Price(Double price, Date startFrom, Date endFrom) {
        this.price = price;
        this.startFrom = startFrom;
        this.endFrom = endFrom;
    }

    public void setPrice(Double price) { this.price = price; }
    public void setStartFrom(Date startFrom) { this.startFrom = startFrom; }
    public void setEndFrom(Date endFrom) { this.endFrom = endFrom; }
    public Double getPrice() { return price; }
    public Date getStartFrom() { return startFrom; }
    public Date getEndFrom() { return endFrom; }

    @Override //nu are
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
