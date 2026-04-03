package inequivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair7091 {

    boolean method1(List<String> list, String streamURL) {
        boolean existing = false;
        if (list != null && list.size() > 0 && streamURL != null) {
            for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
                String url = iterator.next();
                if (url.equalsIgnoreCase(streamURL)) {
                    existing = true;
                }
            }
        }
        return existing;
    }

    boolean method2(List<String> list, String myString) {
        if (myString == null) {
            return false;
        }
        if (list == null) {
            return false;
        }
        String xrr = myString.replace('\\', ' ').replace('/', ' ');
        for (String c : list) {
            String crr = c.replace('\\', ' ').replace('/', ' ');
            if (xrr.equalsIgnoreCase(crr)) {
                return true;
            }
        }
        return false;
    }
}
