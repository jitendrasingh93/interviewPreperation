package spring.dipendency.injection;

/**
 * Created by JitendraSingh on 24/12/17.
 */
public class User {
    private int userId;
    private String name;
    private String email;


    public User(int userId, String name, String email) {
        this.name = name;
        this.userId = userId;
        this.email = email;
    }

    @Override
    public String toString() {
        return "userId : "+userId + "Name : "+name  +"email : "+email;
    }
}
