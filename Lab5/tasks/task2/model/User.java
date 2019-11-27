package tasks.task2.model;

import tasks.task2.auth.Authenticable;

import java.util.Date;

public class User implements Authenticable {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String userName;
    private String hashPassword;

    public User() {}
    public User(String firstName, String lastName, Date dateOfBirth, String userName, String hashPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
        this.hashPassword = hashPassword;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getHashPassword() {
        return hashPassword;
    }

    @Override
    public String getToken() {
        return DEFAULT_TOKEN;
    }
}
