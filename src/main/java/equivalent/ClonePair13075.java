package equivalent;

public class ClonePair13075 {
    String method1(String source, String from, String to) {
        StringBuffer sb = new StringBuffer();
        int oldIndex = 0, newIndex;
        while (-1 != (newIndex = source.indexOf(from, oldIndex))) {
            sb.append(source, oldIndex, newIndex).append(to);
            oldIndex = newIndex + from.length();
        }
        if (oldIndex < source.length()) sb.append(source.substring(oldIndex));
        return sb.toString();
    }

    String method2(String input, String sub, String with) {
        int fromIndex = 0;
        int index = input.indexOf(sub, fromIndex);
        if (index == -1) {
            return input;
        }
        final StringBuilder buf = new StringBuilder(input.length() + with.length());
        do {
            buf.append(input, fromIndex, index);
            buf.append(with);
            fromIndex = index + sub.length();
        }
        while ((index = input.indexOf(sub, fromIndex)) != -1);
        if (fromIndex < input.length()) {
            buf.append(input, fromIndex, input.length());
        }
        return buf.toString();
    }
}
