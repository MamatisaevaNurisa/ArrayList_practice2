import java.util.ArrayList;

public class UserDao {

    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> users() {
        return users;
    }

    public void users(ArrayList<User> usersofArray) {
        this.users = usersofArray;
    }

    public void saveUser(User user) {
        users.add(user);


    }


    public User searchById(int ID) {
        for(User user:users){
            if (user.getID() == ID) {
                return user;
            }

        }
        return users.get(ID);
    }


}
