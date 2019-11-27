package tasks.task2.customer;

import java.util.Date;

public class CustomerDetails {
    private String location;
    private String CNP;
    private Date dateOfBirth;

    public CustomerDetails() {}

    public CustomerDetails(String location, String CNP, Date dateOfBirth) {
        this.location = location;
        this.CNP = CNP;
        this.dateOfBirth = dateOfBirth;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocation() {
        return location;
    }

    public String getCNP() {
        return CNP;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
