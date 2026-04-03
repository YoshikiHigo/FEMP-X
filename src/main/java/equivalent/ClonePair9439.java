package equivalent;

public class ClonePair9439 {
    int method1(int[] vet) {
        int max = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > max) {
                max = vet[i];
            }
        }
        return (max);
    }

    int method2(int[] _d) {
        int max = _d[0];
        for (int i = 1; i < _d.length; i++) {
            if (_d[i] > max) max = _d[i];
        }
        return max;
    }
}
