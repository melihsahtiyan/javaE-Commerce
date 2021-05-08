package core.utils.auth;

import entities.concretes.User;

public class GoogleAuthManager implements AuthService{
    @Override
    public void authenticate(User user) {
        System.out.println("Üyeliğiniz aktif edilmiştir");
    }

    @Override
    public void sendAuthMail(User user) {
        System.out.println("Aktivasyon maili gönderilmiştir..." + "\\\n" + "Aktivasyon kodu " +
                user.getEmail() + " adresine gönderilmiştir.");
    }
}
