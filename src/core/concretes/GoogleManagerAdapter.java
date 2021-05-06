package core.concretes;

import core.abstracts.GoogleService;
import entities.concretes.User;

public class GoogleManagerAdapter implements GoogleService {

    @Override
    public void add(User user) {

        System.out.println(user.getFirstName()+" "+user.getEmail() +" google hesabı ile üye olundu");

    }
}
