package tasks.task2.customer;

import tasks.task2.model.User;

import java.util.Date;

public class Customer extends User { //has CustomerDetails
    private CustomerDetails customerDetails;

    public Customer() {}

    public Customer(String firstName, String lastName, Date dateOfBirth, String userName, String hashPassword, CustomerDetails customerDetails) {
//        if(dateOfBirth == customerDetails.getDateOfBirth()) {
//            // not ok
//        }
        super(firstName, lastName, dateOfBirth, userName, hashPassword);
        this.customerDetails = customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }
}
