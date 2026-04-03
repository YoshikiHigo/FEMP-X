package equivalent;

public class ClonePair4920 {
    int method1(Object[] list, Class t) {
        int count = 0;
        for (int i = 0; i < list.length; i += 2) {
            if (t == list[i]) count++;
        }
        return count;
    }

    int method2(Object[] list, Class t) {
        int count = 0;
        for (int i = 0; i < list.length; i += 2) {
            if (t == list[i]) {
                count++;
            }
        }
        return count;
    }
}
