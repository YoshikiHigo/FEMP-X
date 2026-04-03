package equivalent;

public class ClonePair10734 {
    boolean method1(char c) {
        if ((c >= 'a') && (c <= 'z')) return true;
        if ((c >= 'A') && (c <= 'Z')) return true;
        return c == '_';
    }

    boolean method2(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 95);
    }
}
