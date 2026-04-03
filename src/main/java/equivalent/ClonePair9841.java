package equivalent;

public class ClonePair9841 {
    String[] method1(String[] args, int offset) {
        if (offset >= args.length) {
            return new String[]{};
        }
        String[] ret = new String[args.length - offset];
        System.arraycopy(args, offset, ret, 0, ret.length);
        return ret;
    }

    String[] method2(String[] originalArgs, int stripCount) {
        if (originalArgs.length <= stripCount) {
            return new String[0];
        }
        String[] stripped = new String[originalArgs.length - stripCount];
        System.arraycopy(originalArgs, 0 + stripCount, stripped, 0, stripped.length);
        return stripped;
    }
}
