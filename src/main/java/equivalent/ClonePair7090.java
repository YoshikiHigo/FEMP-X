package equivalent;

import java.util.List;

public class ClonePair7090 {
    boolean method1(List<String> skips, String name) {
        if (skips == null) return false;
        for (String item : skips) {
            if (item.equals(name)) return true;
        }
        return false;
    }

    boolean method2(List<String> list, String value) {
        if (list == null || list.isEmpty()) return false;
        for (String v : list) {
            if (v.equals(value)) return true;
        }
        return false;
    }
}
