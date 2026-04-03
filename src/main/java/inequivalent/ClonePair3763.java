package inequivalent;

import java.util.Map;

public class ClonePair3763 {

    String method1(Map map, String key) {
        String value = (String) map.get(key);
        if (value == null || value.length() == 0) {
            value = null;
        }
        return value;
    }

    String method2(Map properties, String name) {
        String value = (String) properties.get(name);
        value = value == null ? null : value.trim();
        if ("".equals(value)) value = null;
        return value;
    }
}
