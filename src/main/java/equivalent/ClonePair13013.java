package equivalent;

public class ClonePair13013 {
    long method1(String s) {
        s = s.toLowerCase();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') s1 = s1 + c;
            else if (c >= '0' && c <= '9') s1 = s1 + c;
            else s1 = s1 + ' ';
        }
        s1 = s1.trim();
        if (s1.length() > 12) s1 = s1.substring(0, 12);
        long l = 0L;
        for (int j = 0; j < s1.length(); j++) {
            char c1 = s1.charAt(j);
            l *= 37L;
            if (c1 >= 'a' && c1 <= 'z') l += (1 + c1) - 97;
            else if (c1 >= '0' && c1 <= '9') l += (27 + c1) - 48;
        }
        return l;
    }

    long method2(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') s1 = s1 + c;
            else if (c >= 'A' && c <= 'Z') s1 = s1 + (char) ((c + 97) - 65);
            else if (c >= '0' && c <= '9') s1 = s1 + c;
            else s1 = s1 + ' ';
        }
        s1 = s1.trim();
        if (s1.length() > 12) s1 = s1.substring(0, 12);
        long l = 0L;
        for (int j = 0; j < s1.length(); j++) {
            char c1 = s1.charAt(j);
            l *= 37L;
            if (c1 >= 'a' && c1 <= 'z') l += (1 + c1) - 97;
            else if (c1 >= '0' && c1 <= '9') l += (27 + c1) - 48;
        }
        return l;
    }
}
