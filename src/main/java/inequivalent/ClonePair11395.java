package inequivalent;

public class ClonePair11395 {

    String method1(String oldStr, String searchStr, String newStr, int instanceNumber) {
        if (searchStr.length() < 1) {
            return oldStr;
        }
        int startIndex = 0;
        int nextMatch = -1;
        int count = 0;
        while (true) {
            nextMatch = oldStr.indexOf(searchStr, startIndex);
            if (nextMatch < 0) {
                return oldStr;
            }
            count++;
            if (count == instanceNumber) {
                String sb = oldStr.substring(0, nextMatch) +
                        newStr +
                        oldStr.substring(nextMatch + searchStr.length());
                return sb;
            }
            startIndex = nextMatch + searchStr.length();
        }
    }

    String method2(String text, String repl, String with, int max) {
        if (text == null) {
            return null;
        }
        StringBuffer buffer = new StringBuffer(text.length());
        int start = 0;
        int end = 0;
        while ((end = text.indexOf(repl, start)) != -1) {
            buffer.append(text, start, end).append(with);
            start = end + repl.length();
            if (--max == 0) {
                break;
            }
        }
        buffer.append(text.substring(start));
        return buffer.toString();
    }
}
