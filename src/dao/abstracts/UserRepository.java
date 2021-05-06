package dao.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserRepository {

    void add(User user);
    void update(User user);
    void remove(User user);
    User get(int id);
    User getByEmail(String email);
    User getByEmailPassword(String email,String password);
    List<User> getAll();
    List<String> getAllMail();
}
