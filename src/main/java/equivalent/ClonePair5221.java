package equivalent;

import java.util.Properties;

public class ClonePair5221 {
    String method1(Properties p, String prop_name, String def_value) {
        String val = p.getProperty(prop_name);
        if (val == null) {
            return def_value;
        }
        return val;
    }

    String method2(Properties config, String name, String defaultVal) {
        String value = config.getProperty(name);
        if (value == null) {
            value = defaultVal;
        }
        return value;
    }
}
