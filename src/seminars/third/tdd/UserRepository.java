package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void setData(List<User> users) {
        this.data = users;
    }

    public void addUser(User user) {
       data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }
    public List<User> getData(){
        return data;
    }

    public void deleteAllnotAdmin(){
        int len = this.getData().size();
        for (int i=0; i < len ; i++) {
            if(this.getData().get(i).getAdmin() == Boolean.FALSE){
                this.getData().remove(i);
            }

        }


    }

    public void logOutExceptAdministrator() {
        data.removeIf(user -> user.getAdmin());
    }


}