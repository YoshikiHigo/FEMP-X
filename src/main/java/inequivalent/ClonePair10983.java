package inequivalent;

public class ClonePair10983 {

    String method1(String value, String pattern, String replacement) {
        if (value == null || value.length() == 0) return value;
        if (pattern == null || pattern.length() == 0) return value;
        StringBuffer sb = new StringBuffer();
        do {
            int patternIndex = value.indexOf(pattern);
            if (patternIndex == -1) {
                sb.append(value);
                break;
            }
            sb.append(value.substring(0, patternIndex) + replacement);
            value = value.substring(patternIndex + pattern.length());
        }
        while (true);
        return sb.toString();
    }

    String method2(String str0, String str1, String str2) {
        if (str0 == null || str0.equals("")) return str0;
        if (str1 == null || str1.equals("")) str1 = " ";
        String s = "";
        try {
            while (str0.indexOf(str1) != -1) {
                s += str0.substring(0, str0.indexOf(str1)) + str2;
                str2 = str2.trim();
                str0 = str0.substring(str0.indexOf(str1) + str1.length());
            }
            s += str0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (s.equals("")) s = str0;
        return s;
    }
}
