package equivalent;

public class ClonePair12377 {
    String method1(String text, boolean asAttribute) {
        StringBuilder builder = new StringBuilder();
        for (char c : text.toCharArray()) {
            switch (c) {
                case '<':
                    builder.append("&lt;");
                    break;
                case '>':
                    builder.append("&gt;");
                    break;
                case '&':
                    builder.append("&amp;");
                    break;
                case '"':
                    if (asAttribute) {
                        builder.append("&quot;");
                        break;
                    }
                default:
                    builder.append(c);
                    break;
            }
        }
        return builder.toString();
    }

    String method2(String rawText, boolean quotes) {
        StringBuffer output = new StringBuffer();
        int length = rawText.length();
        for (int i = 0; i < length; i++) {
            char ch = rawText.charAt(i);
            switch (ch) {
                case '&':
                    output.append("&amp;");
                    break;
                case '"':
                    if (quotes) {
                        output.append("&quot;");
                    } else {
                        output.append(ch);
                    }
                    break;
                case '<':
                    output.append("&lt;");
                    break;
                case '>':
                    output.append("&gt;");
                    break;
                default:
                    output.append(ch);
            }
        }
        return output.toString();
    }
}
