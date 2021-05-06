package dao.concretes;

import dao.abstracts.UserRepository;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    List<User> userList=new ArrayList<>();
    @Override
    public void add(User user) {
        userList.add(user);

    }

    @Override
    public void update(User user) {
        User userUpdate=new User();
        userUpdate.setFirstName(user.getFirstName());
        userUpdate.setLastName(user.getLastName());
        userUpdate.setEmail(user.getEmail());
        userUpdate.setPassword(user.getPassword());

    }

    @Override
    public void remove(User user) {
        userList.remove(user);
    }

    @Override
    public User get(int id) {
        for (User users: userList){
            if (users.getId()==id){
                return  users;
            }
        }
        return null;
    }

    @Override
    public User getByEmail(String email) {
        for (User users: userList){
            if (users.getEmail()==email){
                return  users;
            }
        }
        return null;
    }

    @Override
    public User getByEmailPassword(String email, String password) {
        for (User users: userList){
            if (users.getEmail()==email && users.getPassword()==password){
                return  users;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return  userList;
    }

    @Override
    public List<String> getAllMail() {
        List<String> emails = new ArrayList<String>();
       for (User users:userList){
           emails.add(users.getEmail());
       }
       return emails;
    }
}
