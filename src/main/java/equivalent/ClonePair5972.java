package equivalent;

public class ClonePair5972 {
    float method1(String string) {
        int pos = 0;
        int length = string.length();
        boolean ok = true;
        while (ok && pos < length) {
            switch (string.charAt(pos)) {
                case '+':
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                    pos++;
                    break;
                default:
                    ok = false;
            }
        }
        if (pos == 0) return 0f;
        if (pos == length) return Float.parseFloat(string + "f");
        float f = Float.parseFloat(string.substring(0, pos) + "f");
        string = string.substring(pos);
        if (string.startsWith("in")) {
            return f * 72f;
        }
        if (string.startsWith("cm")) {
            return (f / 2.54f) * 72f;
        }
        if (string.startsWith("mm")) {
            return (f / 25.4f) * 72f;
        }
        if (string.startsWith("pc")) {
            return f * 12f;
        }
        return f;
    }

    float method2(String string) {
        int pos = 0;
        int length = string.length();
        boolean ok = true;
        while (ok && pos < length) {
            switch (string.charAt(pos)) {
                case '+':
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                    pos++;
                    break;
                default:
                    ok = false;
            }
        }
        if (pos == 0) return 0f;
        if (pos == length) return Float.valueOf(string + "f").floatValue();
        float f = Float.valueOf(string.substring(0, pos) + "f").floatValue();
        string = string.substring(pos);
        if (string.startsWith("in")) {
            return f * 72f;
        }
        if (string.startsWith("cm")) {
            return (f / 2.54f) * 72f;
        }
        if (string.startsWith("mm")) {
            return (f / 25.4f) * 72f;
        }
        if (string.startsWith("pc")) {
            return f * 12f;
        }
        return f;
    }
}
