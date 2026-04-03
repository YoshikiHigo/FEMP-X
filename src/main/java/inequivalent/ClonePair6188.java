package inequivalent;

import java.util.List;

public class ClonePair6188 {

    boolean method1(List<String> l1, List<String> l2) {
        int len1 = l1.size();
        int len2 = l2.size();
        List<String> theList = l1;
        List<String> otherList = l2;
        if (len2 > len1) {
            len1 = len2;
            theList = l2;
            otherList = l1;
        }
        String s;
        for (int i = 0; i < len1; i++) {
            s = theList.get(i);
            if (otherList.contains(s)) return true;
        }
        return false;
    }

    boolean method2(List<String> args1, List<String> args2) {
        if (args1.size() != args2.size()) return false;
        for (int i = 0; i < args1.size(); i++) {
            String arg1 = args1.get(i);
            String arg2 = args2.get(i);
            if (!arg1.equals(arg2)) return false;
        }
        return true;
    }
}
