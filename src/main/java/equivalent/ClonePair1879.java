package equivalent;

import java.util.List;

public class ClonePair1879 {
    String method1(List list) {
        StringBuffer sb = new StringBuffer();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                String s = (String) list.get(i);
                if (i != 0) sb.append(",");
                sb.append(s);
            }
        }
        return sb.toString();
    }

    String method2(List attachFileName) {
        String text = "";
        if (attachFileName != null) {
            for (int i = 0; i < attachFileName.size(); i++) {
                String fileName = (String) attachFileName.get(i);
                text = text + fileName + ",";
            }
            if (text.endsWith(",")) {
                text = text.substring(0, (text.length() - 1));
            }
        }
        return text;
    }
}
