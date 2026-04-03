package inequivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair1907 {

    String method1(List browsers) {
        if (browsers != null && browsers.size() > 0) {
            String browserName = (String) browsers.get(0);
            Iterator iter = browsers.iterator();
            while (iter.hasNext()) {
                String name = (String) iter.next();
                if ("Firefox".equalsIgnoreCase(name)) {
                    return name;
                }
            }
            return browserName;
        }
        return null;
    }

    String method2(List values) {
        if ((values == null) || (values.size() < 1)) {
            return null;
        }
        return (String) values.get(0);
    }
}
