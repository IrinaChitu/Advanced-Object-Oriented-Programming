package tasks.model;

public class User implements Cloneable{
    private Integer id;
    private String username;
    private String password;

    public User() {}

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    @Override //nu are
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        } else {
//            User user = (User)obj;
//            return this.id.equals(user.getId());
//        }
//    }
//
//    public int hashCode() {
//        return this.id.hashCode();
//    }


}
