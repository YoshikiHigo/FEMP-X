package inequivalent;

public class ClonePair11583 {

    boolean method1(char ch) {
        if (ch >= '0' && ch <= '9') return true;
        if (ch >= 'a' && ch <= 'z') return true;
        if (ch >= 'A' && ch <= 'Z') return true;
        return ch == '-' || ch == '_' || ch == '.' || ch == '!' || ch == '~' || ch == '*' || ch == '\'' || ch == '(' || ch == ')' || ch == '/';
    }

    boolean method2(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) return (true);
        String s = "%;/?:@&=+$,-_.!~*'()";
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) return (true);
        return (false);
    }
}
