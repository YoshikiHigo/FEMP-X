package equivalent;

public class ClonePair75 {
    int method1(char[] pArray, char pChar, int pStartPos) {
        int len = pArray.length;
        for (int i = pStartPos; i < len; i++) {
            if (pArray[i] == pChar) {
                return (i);
            }
        }
        return -1;
    }

    int method2(char[] ary, char ch, int start) {
        for (int i = start; i < ary.length; i++) {
            if (ch == ary[i]) {
                return i;
            }
        }
        return -1;
    }
}
