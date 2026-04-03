package inequivalent;

public class ClonePair13012 {

    long method1(String str) {
        long factor = 1;
        char last = Character.toLowerCase(str.charAt(str.length() - 1));
        if ('g' == last) {
            factor = 1L << 30;
            str = str.substring(0, str.length() - 1);
        } else if ('m' == last) {
            factor = 1L << 20;
            str = str.substring(0, str.length() - 1);
        } else if ('k' == last) {
            factor = 1L << 10;
            str = str.substring(0, str.length() - 1);
        }
        return factor * Long.parseLong(str);
    }

    long method2(String s) {
        int co = 1;
        s = s.toLowerCase();
        char b = s.charAt(s.length() - 1);
        if (b == 'b') s.substring(0, s.length() - 1);
        b = s.charAt(s.length() - 1);
        if (b == 'k') co = 1024;
        else if (b == 'm') co = 1024 * 1024;
        else if (b == 'g') co = 1024 * 1024 * 1024;
        if (Character.isLetter(b)) s = s.substring(0, s.length() - 1);
        return Long.parseLong(s) * co;
    }
}
