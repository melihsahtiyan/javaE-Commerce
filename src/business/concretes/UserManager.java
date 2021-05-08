package business.concretes;

import business.abstracts.UserService;
import business.validationRules.UserValidator;
import core.utils.auth.AuthService;
import core.utils.auth.GoogleAuthManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    UserDao userDao;
    AuthService auth;

    public UserManager(UserDao userDao, GoogleAuthManager manager){
        this.userDao=userDao;
        this.auth = manager;
    }

    @Override
    public void add(User user) {
        boolean result = new UserValidator().userValidator(user);
        if (result){
            userDao.add(user);
            auth.sendAuthMail(user);
        }else{
            System.out.println("Üye olma işlemi başarısız...");
        }

    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public List<User> getAll() {
       return userDao.getAll();
    }
}
