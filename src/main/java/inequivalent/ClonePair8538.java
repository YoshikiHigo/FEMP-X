package inequivalent;

public class ClonePair8538 {

    boolean method1(StringBuffer buffer, String suffix) {
        if (suffix.length() > buffer.length()) {
            return false;
        }
        int endIndex = suffix.length() - 1;
        int bufferIndex = buffer.length() - 1;
        while (endIndex >= 0) {
            if (buffer.charAt(bufferIndex) != suffix.charAt(endIndex)) {
                return false;
            }
            bufferIndex--;
            endIndex--;
        }
        return true;
    }

    boolean method2(StringBuffer line, String string) {
        if (line.length() < string.length()) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (line.charAt(i) != string.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
