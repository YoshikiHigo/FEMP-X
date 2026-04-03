package equivalent;

import java.util.Iterator;
import java.util.List;

public class ClonePair1839 {
    String method1(List resultList) {
        StringBuffer sb = new StringBuffer();
        for (Iterator i = resultList.iterator(); i.hasNext(); ) {
            String result = (String) i.next();
            sb.append(result + " ");
        }
        return sb.toString();
    }

    String method2(List l) {
        StringBuffer sb = new StringBuffer();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            String temp = (String) it.next();
            sb.append(temp);
            sb.append(" ");
        }
        return sb.toString();
    }
}
