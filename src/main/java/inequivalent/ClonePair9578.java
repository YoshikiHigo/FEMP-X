package inequivalent;

public class ClonePair9578 {

    boolean method1(char[] str1, char[] str2) {
        if (str1 == str2) return true;
        if (str1.length != str2.length) return false;
        for (int i = 0; i < str1.length; ++i) if (str1[i] != str2[i]) return false;
        return true;
    }

    boolean method2(char[] password1, char[] password2) {
        if (password1.length != password2.length) return false;
        for (int i = 0; i < password2.length; i++) {
            if (password1[i] != password2[i]) return false;
        }
        return true;
    }
}
