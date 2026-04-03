package equivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair58 {
    String method1(List list, String sSeparator) {
        StringBuffer values = new StringBuffer();
        Iterator iter = list.iterator();
        boolean bFirst = true;
        while (iter.hasNext()) {
            if (bFirst) {
                bFirst = false;
            } else {
                values.append(sSeparator);
            }
            values.append(iter.next());
        }
        return values.toString();
    }

    @SuppressWarnings("unchecked")
    String method2(List source, String separator) {
        StringBuffer buffer = new StringBuffer();
        boolean first = true;
        for (Object o : source) {
            if (!first) {
                buffer.append(separator);
            } else {
                first = false;
            }
            buffer.append(o);
        }
        return buffer.toString();
    }
}
