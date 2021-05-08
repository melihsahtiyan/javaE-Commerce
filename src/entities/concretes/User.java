package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
    private int id;
    private String fistName;
    private String lastName;
    private String email;
    private String password;

    public User(String fistName, String lastName, String email, String password) {
            this.fistName = fistName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
        }

    public User(int id, String fistName, String lastName, String email, String password) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
