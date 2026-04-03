package equivalent;

public class ClonePair11690 {
    boolean method1(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        } else if (ch >= 'a' && ch <= 'f') {
            return true;
        } else return ch >= 'A' && ch <= 'F';
    }

    boolean method2(char c) {
        char upper = Character.toUpperCase(c);
        return (upper >= '0' && upper <= '9') || (upper >= 'A' && upper <= 'F');
    }
}
