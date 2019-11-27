package tasks.task2.services;

import tasks.task2.auth.Authenticable;

public class UserService {
    public UserService() {}
    public boolean checkDefToken(Authenticable auth) {
        return auth.getToken() == "TEST";
    }

}
