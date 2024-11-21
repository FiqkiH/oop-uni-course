package TeoriOOP.W12.Projek4;

public class UserAlreadyExists extends RuntimeException {
    private String id;
    private String user;

    public UserAlreadyExists(String message, String id, String user) {
        super(message);
        this.user = user;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public String getId() {
        return id;
    }
}