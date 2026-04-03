package inequivalent;

public class ClonePair3986 {

    String method1(String string, char findChar, char newChar) {
        StringBuffer newString = new StringBuffer();
        int strLen = string.length();
        for (int i = 0; i < strLen; i++) {
            char c = string.charAt(i);
            if (c == findChar) {
                if ((i < (strLen - 1)) && (string.charAt(i + 1) == findChar)) {
                    i++;
                } else {
                    c = newChar;
                }
            }
            newString.append(c);
        }
        return newString.toString();
    }

    String method2(String original, char from, char to) {
        StringBuffer result = new StringBuffer(original.length());
        int at, saved = 0;
        do {
            at = original.indexOf(from);
            if (at >= 0) {
                result.append(original, 0, at);
                result.append(to);
            } else {
                result.append(original.substring(saved));
            }
            saved = at;
        }
        while (at >= 0);
        return result.toString();
    }
}
