package inequivalent;

public class ClonePair8315 {

    int method1(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }

    int method2(int... args) {
        int result = args[0];
        for (int i = 1; i < args.length; i++) if (args[i] > result) result = args[i];
        return result;
    }
}
