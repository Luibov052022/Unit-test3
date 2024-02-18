package seminars.third.tdd;

public class User {

    String name;
    String password;
    Boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.isAdmin = Boolean.FALSE;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

    public void setAdmin(){
        this.isAdmin = Boolean.TRUE;
    }

    public Boolean getAdmin(){
        return this.isAdmin;
    }


}