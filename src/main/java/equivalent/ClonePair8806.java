package equivalent;

public class ClonePair8806 {
    boolean method1(String s, String end) {
        if ((s == null) || (end == null)) {
            return false;
        }
        if (end.length() > s.length()) {
            return false;
        }
        String temp = s.substring(s.length() - end.length());
        return temp.equalsIgnoreCase(end);
    }

    boolean method2(String s, String end) {
        if ((s == null) || (end == null)) return false;
        if (end.length() > s.length()) return false;
        String temp = s.substring(s.length() - end.length());
        return temp.equalsIgnoreCase(end);
    }
}
