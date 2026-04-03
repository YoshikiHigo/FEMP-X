package equivalent;

import java.util.Hashtable;

public class ClonePair8527 {
    String method1(Hashtable hints, String key, String def) {
        String val = (String) hints.get(key);
        if (val == null) {
            val = def;
        }
        return val;
    }

    String method2(Hashtable h, String k, String d) {
        if (h.containsKey(k)) return (String) h.get(k);
        else return d;
    }
}
