package inequivalent;

public class ClonePair9559 {

    int method1(String str, int idx) {
        String ws = " \r\n\t";
        if (idx >= str.length()) return str.length();
        for (int i = idx; i < str.length(); ++i) if (ws.indexOf(str.charAt(i)) < 0) return i;
        return str.length();
    }

    int method2(String srch, int startAt) {
        int len = srch.length();
        while (startAt < len) {
            char toChk = srch.charAt(startAt++);
            if (!Character.isWhitespace(toChk)) return startAt - 1;
        }
        return len;
    }
}
