package GoogleLogger.concretes;

import entities.concretes.User;

public class GoogleManager {
    public void add(User user) {
        System.out.println("Google ile eklendi " + user.getFirstName());

    }
}
