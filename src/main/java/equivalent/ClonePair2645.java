package equivalent;

public class ClonePair2645 {
    int method1(byte[] dataArray) {
        int result = 0;
        int k = 0;
        for (int i = 24; i >= 0; i -= 8) {
            result |= (dataArray[k] & 0xff) << i;
            k++;
        }
        return result;
    }

    int method2(byte[] b) {
        int bla = 0;
        int blu = 0;
        int mal = 1;
        for (int i = 3; i >= 0; i--) {
            blu = b[i];
            if (blu < 0) blu = 256 + blu;
            bla += blu * mal;
            mal *= 256;
        }
        return bla;
    }
}
