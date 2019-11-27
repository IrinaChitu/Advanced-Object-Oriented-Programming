package tasks.task2.auth;

public interface Authenticable {
    public static final String DEFAULT_TOKEN = "TEST";

    String getToken();
    String getUserName();
    String getHashPassword();
}
