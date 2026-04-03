package inequivalent;

public class ClonePair13331 {

    String method1(String line, String oldString, String newString) {
        int i = 0;
        int j = 0;
        if ((i = line.indexOf(oldString, i)) >= 0) {
            char[] line2 = line.toCharArray();
            char[] newString2 = newString.toCharArray();
            int oLength = oldString.length();
            StringBuffer buffer = new StringBuffer(line2.length);
            buffer.append(line2, 0, i).append(newString2);
            i += oLength;
            for (j = i; (i = line.indexOf(oldString, i)) > 0; j = i) {
                buffer.append(line2, j, i - j).append(newString2);
                i += oLength;
            }
            buffer.append(line2, j, line2.length - j);
            return buffer.toString();
        } else {
            return line;
        }
    }

    String method2(String text, String find, String replace) {
        int replaceStart = text.indexOf(find);
        if (replaceStart == -1) return text;
        int findLength = find.length();
        StringBuffer result = new StringBuffer();
        while (replaceStart != -1) {
            result.append(text, 0, replaceStart).append(replace);
            text = text.substring(replaceStart + findLength);
            replaceStart = text.indexOf(find);
        }
        result.append(text);
        return result.toString();
    }
}
