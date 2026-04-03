package inequivalent;

import java.util.Vector;

public class ClonePair11686 {

    String method1(String source, String match, String replace) {
        if (match.equals("")) {
            return source;
        }
        int index = -1;
        int matchLength = match.length();
        int offset = matchLength - replace.length();
        StringBuffer result = new StringBuffer(source);
        Vector indexes = new Vector();
        while ((index = source.indexOf(match, index)) != -1) {
            indexes.addElement(Integer.valueOf(index));
            index += matchLength;
        }
        for (int i = 0; i < indexes.size(); i++) {
            int indexStart = ((Integer) indexes.elementAt(i)).intValue() - offset * i;
            int indexEnd = indexStart + matchLength;
            result.replace(indexStart, indexEnd, replace);
        }
        return result.toString();
    }

    String method2(String text, String search, String replace) {
        final int len = search.length();
        if (len == 0) {
            return text;
        }
        final StringBuffer result = new StringBuffer();
        int pos1 = 0;
        int pos2;
        while (0 <= (pos2 = text.indexOf(search, pos1))) {
            result.append(text, pos1, pos2);
            result.append(replace);
            pos1 = pos2 + len;
        }
        if (pos1 < text.length()) {
            result.append(text.substring(pos1));
        }
        return result.toString();
    }
}
