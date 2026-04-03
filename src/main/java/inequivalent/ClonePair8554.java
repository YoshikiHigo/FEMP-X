package inequivalent;

public class ClonePair8554 {

    String method1(String base, String what) {
        if (base != null && base.endsWith(what)) {
            base = base.substring(0, base.length() - what.length());
        }
        return base;
    }

    String method2(String path, String separator) {
        if (path == null) return null;
        final int index = path.indexOf(separator);
        if (index == -1) return path;
        return path.substring(0, index);
    }
}
