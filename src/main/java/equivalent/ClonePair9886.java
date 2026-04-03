package equivalent;

public class ClonePair9886 {
    String[] method1(String[] lines, int amountToRemove) {
        String[] result = new String[lines.length - amountToRemove];
        System.arraycopy(lines, 0 + amountToRemove, result, 0, result.length);
        return result;
    }

    String[] method2(String[] args, int pos) {
        String[] result = new String[args.length - pos];
        if (args.length - pos >= 0) System.arraycopy(args, pos, result, pos - pos, args.length - pos);
        return result;
    }
}
