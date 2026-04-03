package equivalent;

public class ClonePair2704 {
    boolean method1(byte[] a, byte[] b) {
        int aLength = a.length;
        if (aLength != b.length) return false;
        for (int i = 0; i < aLength; i++) if (a[i] != b[i]) return false;
        return true;
    }

    boolean method2(byte[] text, byte[] password) {
        if (text.length != password.length) return false;
        for (int i = 0; i < text.length && i < password.length; i++) {
            if (text[i] != password[i]) return false;
        }
        return true;
    }
}
