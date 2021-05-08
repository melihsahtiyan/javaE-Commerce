package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUser implements UserDao {

    List<User> users;

    public InMemoryUser(){
      /*  this.users.add(new User(2,"Edvin","Davulju","edvinegötten@gmail.com","12345"));
        this.users.add(new User(1,"Melih","Sahtiyan","melih@gmail.com","12345"));*/
    }

    @Override
    public void add(User user) {
        this.users.add(user);
    }

    @Override
    public void update(User user) {
        this.users.remove(user.getId());
    }

    @Override
    public void delete(User user) {
        this.users.remove(user.getId());
    }

    @Override
    public List<User> getAll() {
        return this.users.subList(0,1000);
    }
}
