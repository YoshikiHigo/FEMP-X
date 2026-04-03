package equivalent;

public class ClonePair3918 {
    byte[] method1(byte[] wektorA, byte[] wektorB, int rozmiarBloku) {
        byte[] wynik = new byte[rozmiarBloku];
        for (int i = 0; i < rozmiarBloku; i++) {
            wynik[i] = (byte) (wektorA[i] ^ wektorB[i]);
        }
        return wynik;
    }

    byte[] method2(byte[] b1, byte[] b2, int length) {
        byte[] result = new byte[length];
        for (int i = 0; i < length; ++i) result[i] = (byte) (b1[i] ^ b2[i]);
        return result;
    }
}
