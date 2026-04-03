package equivalent;

public class ClonePair8134 {
    boolean method1(int min, int max, String string) {
        int length = string.length();
        return length >= min && length <= max;
    }

    boolean method2(int rangoInicial, int rangoFinal, String text) {
        return text.length() >= rangoInicial && text.length() <= rangoFinal;
    }
}
