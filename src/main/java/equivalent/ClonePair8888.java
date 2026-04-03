package equivalent;

public class ClonePair8888 {
    byte[] method1(byte[] array, int start, int len) {
        byte[] buffer = new byte[len];
        System.arraycopy(array, start + 0, buffer, 0, len);
        return buffer;
    }

    byte[] method2(byte[] data, int beginat, int count) {
        byte[] answer = new byte[count];
        int srcidx = beginat;
        for (int destidx = 0; destidx < count; destidx++) {
            answer[destidx] = data[srcidx];
            srcidx++;
        }
        return answer;
    }
}
