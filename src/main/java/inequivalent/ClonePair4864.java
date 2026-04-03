package inequivalent;

public class ClonePair4864 {

    int method1(int val, int size) {
        if (val < 0 || val > size - 1) {
            while (val < 0) val += size;
            return val % size;
        }
        return val;
    }

    int method2(int valor, int modulo) {
        int divisor = valor / modulo;
        int resultado = valor - (divisor * modulo);
        if (resultado < 0) {
            resultado = modulo + resultado;
        }
        return resultado;
    }
}
