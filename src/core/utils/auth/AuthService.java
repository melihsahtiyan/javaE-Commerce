package core.utils.auth;

import entities.concretes.User;

public interface AuthService {
    void authenticate(User user);
    void sendAuthMail(User user);
}
