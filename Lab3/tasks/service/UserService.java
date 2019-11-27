package tasks.service;

import tasks.model.User;

public class UserService {
    private static UserService ourInstance = new UserService();
    private static User[] listOfUsers = new User[4];

    //private UserService() {}
    private UserService() {
        listOfUsers[0] = new User(1, "Ioana", "password");
        listOfUsers[1] = new User(2, "Adelin", "password");
        listOfUsers[2] = new User(3, "Marcu", "password");
        listOfUsers[3] = new User(4, "Doru", "password");
    }

    public static UserService getInstance() {
        return ourInstance;
    }

    public User getUserByID(Integer id) {
        for(User u: listOfUsers) {
            if(u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public User getUserByUsername(String username) {
        for(User u: listOfUsers) {
            if(u.getUsername() == username) {
                return u;
            }
        }
        return null;
    }

}
