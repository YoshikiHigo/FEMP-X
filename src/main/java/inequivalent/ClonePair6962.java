package inequivalent;

import java.util.ArrayList;
import java.util.List;

public class ClonePair6962 {

    List<String> method1(String string, char splitToken) {
        ArrayList<String> strings = new ArrayList();
        if (string.length() == 0) {
            return strings;
        }
        char[] characters = string.toCharArray();
        char c = characters[0];
        boolean isQuoted = false;
        StringBuffer buff = new StringBuffer(100);
        for (int i = 0; i < characters.length; i++) {
            c = characters[i];
            if (isQuoted) {
                if (c == '"') {
                    isQuoted = false;
                }
                buff.append(c);
            } else if (c == '"') {
                isQuoted = true;
                buff.append(c);
            } else {
                if (c == splitToken) {
                    strings.add(buff.toString().trim());
                    buff.setLength(0);
                } else {
                    buff.append(c);
                }
            }
        }
        if (buff.length() > 0) {
            strings.add(buff.toString().trim());
        }
        return strings;
    }

    List<String> method2(String s, char separator) {
        ArrayList<String> lst = new ArrayList<String>(4);
        int pos = 0, start = 0, end = s.length();
        char inString = 0;
        char ch = 0;
        while (pos < end) {
            char prevChar = ch;
            ch = s.charAt(pos++);
            if (ch == '\\') {
                pos++;
            } else if (inString != 0 && ch == inString) {
                inString = 0;
            } else if (ch == '\'' || ch == '"') {
                if (!Character.isLetterOrDigit(prevChar)) {
                    inString = ch;
                }
            } else if (ch == separator && inString == 0) {
                lst.add(s.substring(start, pos - 1));
                start = pos;
            }
        }
        if (start < end) {
            lst.add(s.substring(start, end));
        }
        return lst;
    }
}
