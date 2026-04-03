package inequivalent;

public class ClonePair10934 {

    boolean method1(char c1, char c2, boolean ignCase) {
        if (ignCase) return Character.toLowerCase(c1) == Character.toLowerCase(c2);
        return c1 == c2;
    }

    boolean method2(char a, char b, boolean ignoreCase) {
        if (a == b) return true;
        else if (!ignoreCase) return false;
        else {
            a = Character.toUpperCase(a);
            if (a == b) return true;
            else {
                b = Character.toUpperCase(b);
                if (a == b) return true;
                else {
                    a = Character.toLowerCase(a);
                    if (a == b) return true;
                    else return a == Character.toLowerCase(b);
                }
            }
        }
    }
}
