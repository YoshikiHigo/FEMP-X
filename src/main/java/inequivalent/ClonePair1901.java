package inequivalent;

import java.util.List;

public class ClonePair1901 {

    String method1(List list) {
        StringBuffer s = new StringBuffer();
        if (list != null) for (int i = 0; i < list.size(); i++) {
            s.append(list.get(i));
            s.append("\n");
        }
        return s.toString();
    }

    String method2(List list) {
        StringBuffer sb = new StringBuffer();
        if (list != null) {
            boolean addComma = false;
            for (int i = 0; i < list.size(); i++) {
                if (addComma) {
                    sb.append(", ");
                }
                sb.append(list.get(i));
                addComma = true;
            }
        }
        return sb.toString();
    }
}
