package inequivalent;

public class ClonePair9203 {

    boolean method1(String url1, String url2) {
        if ((url1.length() > 1) && url1.endsWith("/")) url1 = url1.substring(0, url1.length() - 1);
        if ((url2.length() > 1) && url2.endsWith("/")) url2 = url2.substring(0, url2.length() - 1);
        return url1.equalsIgnoreCase(url2);
    }

    boolean method2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            result |= (c1 ^ c2);
        }
        return result == 0;
    }
}
