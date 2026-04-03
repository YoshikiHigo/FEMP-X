package equivalent;

public class ClonePair9322 {
    boolean method1(char c) {
        return ('0' <= c && '9' >= c) || ('a' <= c && 'f' >= c) || ('A' <= c && 'F' >= c);
    }

    boolean method2(char c) {
        return ((c >= '0') && (c <= '9')) || ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F'));
    }
}
