package equivalent;

public class ClonePair7157 {
    StringBuffer method1(String data, StringBuffer buffer) {
        if (data == null) {
            return buffer;
        }
        int length = data.length();
        for (int i = 0; i < length; ++i) {
            char currentChar = data.charAt(i);
            if (currentChar == '&') {
                buffer.append("&amp;");
            } else if (currentChar == '\'' || currentChar == '`') {
                buffer.append("&apos;");
            } else if (currentChar == '\"') {
                buffer.append("&quot;");
            } else if (currentChar == '<') {
                buffer.append("&lt;");
            } else if (currentChar == '>') {
                buffer.append("&gt;");
            } else {
                buffer.append(currentChar);
            }
        }
        return buffer;
    }

    StringBuffer method2(String data, StringBuffer buffer) {
        if (data == null) return buffer;
        int length = data.length();
        for (int i = 0; i < length; ++i) {
            char currentChar = data.charAt(i);
            if (currentChar == '&') {
                buffer.append("&amp;");
            } else if (currentChar == '\'' || currentChar == '`') {
                buffer.append("&apos;");
            } else if (currentChar == '\"') {
                buffer.append("&quot;");
            } else if (currentChar == '<') {
                buffer.append("&lt;");
            } else if (currentChar == '>') {
                buffer.append("&gt;");
            } else {
                buffer.append(currentChar);
            }
        }
        return buffer;
    }
}
