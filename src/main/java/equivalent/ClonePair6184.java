package equivalent;

import java.util.List;

public class ClonePair6184 {
    boolean method1(List<String> toList, List<String> otherToList) {
        if (toList.size() != otherToList.size()) return false;
        for (int i = 0; i < toList.size(); i++) {
            if (!toList.get(i).equals(otherToList.get(i))) return false;
        }
        return true;
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
