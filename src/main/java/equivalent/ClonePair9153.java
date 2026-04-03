package equivalent;

public class ClonePair9153 {
    boolean method1(byte b) {
        switch (b) {
            case ' ':
            case '\r':
            case '\n':
            case '\t':
                return (true);
        }
        return (false);
    }

    boolean method2(byte b) {
        return b == ' ' || b == '\t' || b == '\r' || b == '\n';
    }
}
