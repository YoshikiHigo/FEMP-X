package equivalent;

public class ClonePair12817 {
    String method1(String[] ss, int idx) {
        if (ss.length > idx) return ss[idx];
        else return "";
    }

    String method2(String[] array, int posicao) {
        if (array.length > posicao) {
            return array[posicao];
        } else {
            return "";
        }
    }
}
