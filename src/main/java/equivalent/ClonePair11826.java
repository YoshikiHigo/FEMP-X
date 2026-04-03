package equivalent;

public class ClonePair11826 {
    boolean method1(char x) {
        return (x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || x == '_';
    }

    boolean method2(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_';
    }
}
