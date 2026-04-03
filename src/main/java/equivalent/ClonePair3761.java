package equivalent;

import java.util.Map;

public class ClonePair3761 {
    String method1(Map formData, String key) {
        Object values = formData.get(key);
        if (values == null) return null;
        else if (values instanceof String) return (String) values;
        else if (values instanceof String[]) return ((String[]) values)[0];
        return null;
    }

    @SuppressWarnings("unchecked")
    String method2(Map formData, String key) {
        Object values = formData.get(key);
        if (values == null) return null;
        else if (values instanceof String) return ((String) values);
        else if (values instanceof String[]) return ((String[]) values)[0];
        return null;
    }
}
