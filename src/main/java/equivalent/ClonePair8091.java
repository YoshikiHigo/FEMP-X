package equivalent;

public class ClonePair8091 {
    String method1(int count, String stringToCopy) {
        final int capacity = count * stringToCopy.length();
        final StringBuilder sb = new StringBuilder(capacity);
        for (int idx = 0; idx < count; ++idx) {
            sb.append(stringToCopy);
        }
        return sb.toString();
    }

    String method2(int depth, String prefixStr) {
        StringBuffer strBuf = new StringBuffer(prefixStr.length() * depth);
        for (int index = 0; index < depth; index++) {
            strBuf.append(prefixStr);
        }
        return strBuf.toString();
    }
}
