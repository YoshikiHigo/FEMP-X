package equivalent;

public class ClonePair9695 {
    boolean method1(char[] password, char[] verifyPassword) {
        if (password.length != verifyPassword.length) {
            return false;
        }
        for (int i = 0; i < password.length; i++) {
            if (password[i] != verifyPassword[i]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(char[] password1, char[] password2) {
        if (password1.length != password2.length) {
            return false;
        } else {
            for (int i = 0; i < password1.length; i++) {
                if (password1[i] != password2[i]) return false;
            }
        }
        return true;
    }
}
