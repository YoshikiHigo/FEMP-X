package inequivalent;

public class ClonePair8086 {

    String method1(int l, String string) {
        if (string.length() > l) {
            string = string.substring(0, l);
        }
        StringBuffer str = new StringBuffer(l);
        str.append(string);
        final int stop = l - string.length();
        for (int i = 0; i < stop; i++) {
            str.append(' ');
        }
        return str.toString();
    }

    String method2(int l, String string) {
        if (string.length() > l) {
            string = string.substring(0, l);
        }
        final StringBuffer str = new StringBuffer(l);
        final int stop = l - string.length();
        for (int i = 0; i < stop; i++) {
            str.append('0');
        }
        str.append(string);
        return str.toString();
    }
}
