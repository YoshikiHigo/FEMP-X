package inequivalent;

public class ClonePair8117 {

    String method1(int level, String value) {
        StringBuilder dest = new StringBuilder(value.length() + level);
        for (int pad = 0; pad < level; pad++) {
            dest.append(' ').append(' ');
        }
        value = dest.append(value).toString();
        return value;
    }

    String method2(int preSpaces, String s) {
        StringBuilder b = new StringBuilder(preSpaces + s.length());
        for (int i = 0; i < preSpaces; i++) b.append(' ');
        b.append(s.replace(' ', ' '));
        return b.toString();
    }
}
