package equivalent;

public class ClonePair9971 {
    boolean method1(char cToCheck) {
        return cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t';
    }

    boolean method2(char c) {
        boolean rval = c == ' ' || c == '\n' || c == '\t' || c == '\r';
        return rval;
    }
}
