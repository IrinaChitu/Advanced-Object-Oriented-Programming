package tasks.task2;

import tasks.task2.customer.Customer;
import tasks.task2.customer.CustomerDetails;
import tasks.task2.services.UserService;

import java.util.Calendar;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        // Date birthDate = new Date(1998, 10, 20); //deprecated
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        Date birthDate = cal.getTime();
        CustomerDetails cDetails = new CustomerDetails("Bucuresti", "2981020430117", birthDate);
        Customer Irina = new Customer("Irina", "Chitu", birthDate, "nic_irina", "psw123", cDetails);

        UserService us = new UserService();
        System.out.println(us.checkDefToken(Irina));

    }
}
