package equivalent;

import java.util.StringTokenizer;

public class ClonePair7922 {
    String[] method1(String str, String separator, int max) {
        StringTokenizer tok = null;
        if (separator == null) {
            tok = new StringTokenizer(str);
        } else {
            tok = new StringTokenizer(str, separator);
        }
        int listSize = tok.countTokens();
        if (max > 0 && listSize > max) {
            listSize = max;
        }
        String[] list = new String[listSize];
        int i = 0;
        int lastTokenBegin = 0;
        int lastTokenEnd = 0;
        while (tok.hasMoreTokens()) {
            if (max > 0 && i == listSize - 1) {
                String endToken = tok.nextToken();
                lastTokenBegin = str.indexOf(endToken, lastTokenEnd);
                list[i] = str.substring(lastTokenBegin);
                break;
            } else {
                list[i] = tok.nextToken();
                lastTokenBegin = str.indexOf(list[i], lastTokenEnd);
                lastTokenEnd = lastTokenBegin + list[i].length();
            }
            i++;
        }
        return list;
    }

    String[] method2(String _str, String _sep, int _max) {
        StringTokenizer tok = null;
        if (_sep == null) {
            tok = new StringTokenizer(_str);
        } else {
            tok = new StringTokenizer(_str, _sep);
        }
        int listSize = tok.countTokens();
        if (_max > 0 && listSize > _max) {
            listSize = _max;
        }
        String[] list = new String[listSize];
        int i = 0;
        int lastTokenBegin = 0;
        int lastTokenEnd = 0;
        while (tok.hasMoreTokens()) {
            if (_max > 0 && i == listSize - 1) {
                String endToken = tok.nextToken();
                lastTokenBegin = _str.indexOf(endToken, lastTokenEnd);
                list[i] = _str.substring(lastTokenBegin);
                break;
            }
            list[i] = tok.nextToken();
            lastTokenBegin = _str.indexOf(list[i], lastTokenEnd);
            lastTokenEnd = lastTokenBegin + list[i].length();
            i++;
        }
        return list;
    }
}
