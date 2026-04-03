package inequivalent;

public class ClonePair3172 {

    String method1(String s, String a_find, boolean a_includeFind) {
        if (s == null) {
            return null;
        }
        if (a_find == null) {
            return s;
        }
        int l_index = s.indexOf(a_find);
        if (l_index == -1) {
            return s;
        }
        if (!a_includeFind) {
            l_index += a_find.length();
        }
        return s.substring(l_index);
    }

    String method2(String s, String a_find, boolean a_includeFind) {
        if (s == null) {
            return null;
        }
        if (a_find == null) {
            return s;
        }
        int l_index = s.lastIndexOf(a_find);
        if (l_index == -1) {
            return s;
        }
        if (!a_includeFind) {
            l_index += a_find.length();
        }
        return s.substring(l_index);
    }
}
