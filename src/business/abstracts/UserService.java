package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void signUp(User user);
    void signIn(User user,String email,String password);
    void add(User user);
    void update(User user);
    void remove(User user);
    User get(int id);
    User getByEmail(String email);
    User getByEmailPassword(String email,String password);
    List<User> getAll();
}
