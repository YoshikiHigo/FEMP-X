package equivalent;

public class ClonePair9666 {
    boolean method1(char ch) {
        return (ch == ' ') || (ch == '\t') || (ch == '\r') || (ch == '\n');
    }

    @SuppressWarnings("unused")
    boolean method2(char c) {
        switch (c) {
            case ' ':
            case '\r':
            case '\n':
            case '\t':
                return true;
        }
        return false;
    }
}
