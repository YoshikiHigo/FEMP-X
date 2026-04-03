package equivalent;

public class ClonePair8623 {
    boolean method1(char currentChar) {
        return (currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= '0' && currentChar <= '9') || currentChar == '_' || currentChar == '-';
    }

    boolean method2(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= '0' && c <= '9') return true;
        return c == '_' || c == '-';
    }
}
