package business.concretes;

import business.abstracts.UserService;
import core.abstracts.GoogleService;
import dao.abstracts.UserRepository;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserRepository userRepository;
    private GoogleService gservice;

    public UserManager(UserRepository userRepository , GoogleService gservice) {
        this.userRepository = userRepository;
        this.gservice=gservice;

    }

    @Override
    public void signUp(User user) {

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        if ((user.getPassword().length() > 6) && user.getEmail().matches(regex) && !(userRepository.getAllMail().contains(user.getEmail()))
                && user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 ) {

            System.out.println("Merhaba "+ user.getFirstName()+" Üyeliğiniz başarı ile oluşturuldu");
            this.userRepository.add(user);
            this.gservice.add(user);

        }
        else {

            System.out.println("Maalesef "+ user.getFirstName()+" Üyeliğiniz oluşturulamadı.");

        }

    }

    @Override
    public void signIn(User user, String email, String password) {
        if(email == user.getEmail() && password == user.getPassword()  ) {

            System.out.println("Giriş başarıyla yapıldı");

        }
        else
            System.out.println("Giriş başarısız");


    }

    @Override
    public void add(User user) {
       this.userRepository.add(user);

    }

    @Override
    public void update(User user) {
        this.userRepository.update(user);

    }

    @Override
    public void remove(User user) {
        this.userRepository.remove(user);

    }

    @Override
    public User get(int id) {
         return this.userRepository.get(id);

    }

    @Override
    public User getByEmail(String email) {
       return this.userRepository.getByEmail(email);
    }

    @Override
    public User getByEmailPassword(String email, String password) {
        return  this.userRepository.getByEmailPassword(email,password);
    }

    @Override
    public List<User> getAll() {
       return this.userRepository.getAll();
    }
}
