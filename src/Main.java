import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       User user = new User();
       user.setID(1);
       user.setName("Nurisa");
       user.setAge(22);

       UserDao userDao = new UserDao();
       userDao.saveUser(user);


        User user1 = new User();
        user1.setID(1);
        user1.setName("Nurisa");
        user1.setAge(22);
        userDao.saveUser(user1);

        System.out.println(userDao.searchById(1));





    }
}