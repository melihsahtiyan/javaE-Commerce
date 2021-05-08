import business.concretes.UserManager;
import core.utils.auth.GoogleAuthManager;
import dataAccess.concretes.HibernateUser;
import dataAccess.concretes.InMemoryUser;
import entities.concretes.User;

public class Main {
    public static void main(String [] args){

        User user = new User("Melih","Sahtiyan","melih@gmail.com","123456");
        UserManager manager = new UserManager(new HibernateUser(),new GoogleAuthManager());
        manager.add(user);
        manager.getAll();
    }
}
