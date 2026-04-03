package inequivalent;

public class ClonePair10967 {

    String method1(String cadena, int tamano, String substitucion_recorte) {
        if (cadena != null) {
            if (cadena.length() > tamano) {
                cadena = cadena.substring(0, tamano) + substitucion_recorte;
            }
        }
        return cadena;
    }

    String method2(String text, int len, String suffix) {
        if (text != null) {
            if (text.length() > len) {
                return text.substring(0, len).trim() + suffix;
            }
        }
        return text;
    }
}
