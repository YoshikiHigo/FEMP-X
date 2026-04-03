package equivalent;

public class ClonePair9525 {
    int method1(int[] elements) {
        int index = 0;
        int least = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < least) {
                index = i;
                least = elements[i];
            }
        }
        return index;
    }

    int method2(int[] pos) {
        int newPos = pos[0];
        int resultIndex = 0;
        for (int i = 1; i < pos.length; i++) {
            if (pos[i] < newPos) {
                resultIndex = i;
                newPos = pos[i];
            }
        }
        return resultIndex;
    }
}
