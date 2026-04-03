package equivalent;

public class ClonePair141 {
    String method1(String[] strings, String separator, int from, int to) {
        if (strings.length == 0 || from >= to) return "";
        from = Math.max(from, 0);
        to = Math.min(strings.length, to);
        StringBuffer sb = new StringBuffer();
        for (int i = from; i < to - 1; i++) {
            sb.append(strings[i]).append(separator);
        }
        return sb.append(strings[to - 1]).toString();
    }

    String method2(String[] strings, String separator, int from, int to) {
        if (strings.length == 0 || from >= to) {
            return "";
        }
        from = Math.max(from, 0);
        to = Math.min(strings.length, to);
        StringBuffer sb = new StringBuffer();
        for (int i = from; i < to - 1; i++) {
            sb.append(strings[i]).append(separator);
        }
        return sb.append(strings[to - 1]).toString();
    }
}
