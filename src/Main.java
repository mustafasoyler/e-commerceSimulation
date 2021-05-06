import business.concretes.UserManager;
import core.concretes.GoogleManagerAdapter;
import dao.concretes.UserRepositoryImpl;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1L,"Mustafa","Söyler","musti@outlook.com","1234567");

        User user2 = new User(2L,"Süleyman","Demirel","sülo.@outlook.com","12345678");

        UserManager manager = new UserManager(new UserRepositoryImpl(),new GoogleManagerAdapter());

        manager.signUp(user1);
        manager.signIn(user1, "musti@outlook.com", "1234567");


        System.out.println("<!---------------------------------------------------------------!>");

        manager.signUp(user2);
        manager.signIn(user2, "sülo@outlook.com", "1234567");



    }
}
