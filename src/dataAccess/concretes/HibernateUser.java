package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUser implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı eklendi");
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı güncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı silindi");
    }

    @Override
    public List<User> getAll() {
        System.out.println("Kullanıcılar listelendi");
        return null;
    }


}
