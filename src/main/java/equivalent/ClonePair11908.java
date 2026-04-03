package equivalent;

public class ClonePair11908 {
    boolean method1(char ch) {
        if ((ch >= '0') && (ch <= '9')) {
            return true;
        }
        if ((ch >= 'A') && (ch <= 'Z')) {
            return true;
        }
        return (ch >= 'a') && (ch <= 'z');
    }

    boolean method2(char aChar) {
        return ((aChar >= 'A') && (aChar <= 'Z')) || ((aChar >= 'a') && (aChar <= 'z')) || ((aChar >= '0') && (aChar <= '9'));
    }
}
