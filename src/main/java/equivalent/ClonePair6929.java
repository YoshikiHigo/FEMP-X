package equivalent;

public class ClonePair6929 {
    int method1(byte[] bytes, int indexIni) {
        int resultado = 0;
        if (bytes[indexIni] < 0) {
            resultado += (256 + bytes[indexIni]) * ((int) Math.pow(2, 24));
        } else {
            resultado += bytes[indexIni] * ((int) Math.pow(2, 24));
        }
        indexIni++;
        if (bytes[indexIni] < 0) {
            resultado += (256 + bytes[indexIni]) * ((int) Math.pow(2, 16));
        } else {
            resultado += bytes[indexIni] * ((int) Math.pow(2, 16));
        }
        indexIni++;
        if (bytes[indexIni] < 0) {
            resultado += (256 + bytes[indexIni]) * ((int) Math.pow(2, 8));
        } else {
            resultado += bytes[indexIni] * ((int) Math.pow(2, 8));
        }
        indexIni++;
        if (bytes[indexIni] < 0) {
            resultado += 256 + bytes[indexIni];
        } else {
            resultado += bytes[indexIni];
        }
        return resultado;
    }

    int method2(byte[] data, int offset) {
        int res = 0;
        for (int i = 0; i < 4; i++) {
            res = (res << 8) | (data[offset + i] & 0xff);
        }
        return res;
    }
}
