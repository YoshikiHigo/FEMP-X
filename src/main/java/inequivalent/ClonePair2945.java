package inequivalent;

public class ClonePair2945 {

    boolean method1(byte[] read_data) {
        int i;
        for (i = 0; i < read_data.length; i++) {
            if ((read_data[i] < 0) || (read_data[i] > 126)) {
                return false;
            }
        }
        return true;
    }

    boolean method2(byte[] value) {
        int length = value.length;
        int b = ' ';
        int e = '~';
        boolean isPrintable = true;
        int i = 0;
        while (i < length && isPrintable) {
            isPrintable = ((value[i] >= b && value[i] <= e) || Character.isWhitespace((char) value[i]) || value[i] == 0);
            i++;
        }
        return isPrintable;
    }
}
