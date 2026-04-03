package equivalent;

public class ClonePair7579 {
    String method1(char c) {
        if (c == '<') {
            return "&lt;";
        } else if (c == '>') {
            return "&gt;";
        } else if (c == '&') {
            return "&amp;";
        } else if (c == '"') {
            return "&quot;";
        } else {
            return String.valueOf(c);
        }
    }

    String method2(char c9) {
        switch (c9) {
            case '<':
                return "&lt;";
            case '>':
                return "&gt;";
            case '&':
                return "&amp;";
            case '\"':
                return "&quot;";
        }
        return String.valueOf(c9);
    }
}
