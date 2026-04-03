package equivalent;

import java.util.List;

public class ClonePair9188 {
    String method1(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        return list.remove(list.size() - 1);
    }

    String method2(List<String> list) {
        if (list.isEmpty()) return "";
        return list.remove(list.size() - 1);
    }
}
