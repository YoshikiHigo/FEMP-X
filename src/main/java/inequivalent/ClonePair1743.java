package inequivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair1743 {

    String method1(List localeNames) {
        StringBuffer result = new StringBuffer();
        if (localeNames != null) {
            Iterator i = localeNames.iterator();
            while (i.hasNext()) {
                result.append(i.next().toString());
                if (i.hasNext()) {
                    result.append(", ");
                }
            }
        }
        return result.toString();
    }

    String method2(List elements) {
        if (elements == null || elements.isEmpty()) return "";
        String str = "[";
        int size = elements.size();
        for (int i = 0; i < size; i++) str += "'" + elements.get(i).toString() + "',";
        return str.substring(0, str.length() - 1) + "]";
    }
}
