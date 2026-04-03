package inequivalent;

public class ClonePair13420 {

    String method1(String string, String from, String to) {
        if ((string == null) || (string.length() == 0)) {
            return string;
        } else if ((string.length() == 1) && string.equals(from)) {
            return to;
        } else if ((string.length() == 1) && !string.equals(from)) {
            return string;
        }
        int index = -1;
        while ((index = string.indexOf(from)) >= 0) {
            string = string.substring(0, index) + (char) 5 + string.substring(index + from.length());
        }
        int sunIndex = -1;
        while ((sunIndex = string.indexOf((char) 5)) >= 0) {
            string = string.substring(0, sunIndex) + to + string.substring(sunIndex + 1);
        }
        return string;
    }

    String method2(String str, String oldStr, String newStr) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer buffer = new StringBuffer();
        int pos = 0;
        int oldPos = 0;
        while ((pos = str.indexOf(oldStr, oldPos)) != -1) {
            buffer.append(str, oldPos, pos);
            buffer.append(newStr);
            oldPos = pos + oldStr.length();
        }
        buffer.append(str, oldPos, str.length());
        return buffer.toString();
    }
}
