package equivalent;

import java.util.Vector;

public class ClonePair3079 {
    String[] method1(String source, String div) {
        int arynum = 0, intIdx = 0, intIdex = 0, div_length = div.length();
        if (source.compareTo("") != 0) {
            if (source.indexOf(div) != -1) {
                intIdx = source.indexOf(div);
                for (int intCount = 1; ; intCount++) {
                    if (source.indexOf(div, intIdx + div_length) != -1) {
                        intIdx = source.indexOf(div, intIdx + div_length);
                        arynum = intCount;
                    } else {
                        arynum += 2;
                        break;
                    }
                }
            } else {
                arynum = 1;
            }
        } else {
            arynum = 0;
        }
        intIdx = 0;
        intIdex = 0;
        String[] returnStr = new String[arynum];
        if (source.compareTo("") != 0) {
            if (source.indexOf(div) != -1) {
                intIdx = source.indexOf(div);
                returnStr[0] = source.substring(0, intIdx);
                for (int intCount = 1; ; intCount++) {
                    if (source.indexOf(div, intIdx + div_length) != -1) {
                        intIdex = source.indexOf(div, intIdx + div_length);
                        returnStr[intCount] = source.substring(intIdx + div_length, intIdex);
                        intIdx = source.indexOf(div, intIdx + div_length);
                    } else {
                        returnStr[intCount] = source.substring(intIdx + div_length);
                        break;
                    }
                }
            } else {
                returnStr[0] = source;
                return returnStr;
            }
        } else {
            return returnStr;
        }
        return returnStr;
    }

    String[] method2(String str, String delim) {
        Vector<String> vec = new Vector<String>();
        int offset = str.indexOf(delim), prevIndex = -1;
        String cur = null;
        while (offset != -1 && offset < str.length()) {
            if (offset > 0) {
                cur = str.substring(prevIndex + 1, offset);
                vec.add(cur);
                prevIndex = offset;
                offset = str.indexOf(delim, prevIndex + 1);
            }
        }
        if (offset < str.length() - 1) {
            vec.add(str.substring(prevIndex + 1));
        }
        return vec.toArray(new String[0]);
    }
}
