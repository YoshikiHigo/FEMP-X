package equivalent;

public class ClonePair10044 {
    boolean method1(char caractere) {
        return caractere > 64 && caractere < 91 || caractere > 96 && caractere < 123;
    }

    boolean method2(char c) {
        if ((c >= 'a') && (c <= 'z')) return true;
        return (c >= 'A') && (c <= 'Z');
    }
}
