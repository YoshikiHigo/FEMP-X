package equivalent;

public class ClonePair9875 {
    String[] method1(String[] in, int skip) {
        String[] tmp = new String[in.length + -1];
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (i != skip) {
                tmp[j++] = in[i];
            }
        }
        return tmp;
    }

    String[] method2(String[] src, int index) {
        if (index < 0 && index >= src.length) return src;
        String[] newArr = new String[src.length - 1];
        int minus = 0;
        for (int i = 0; i < src.length; i++) {
            if (i == index) minus = 1;
            else newArr[i - minus] = src[i];
        }
        return newArr;
    }
}
