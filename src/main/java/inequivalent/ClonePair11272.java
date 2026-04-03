package inequivalent;

import java.util.List;

public class ClonePair11272 {

    boolean method1(String cadena, List<String> lista) {
        boolean resultado = false;
        if (cadena == null || lista == null) {
            return false;
        }
        if (lista.size() == 0) {
            return false;
        }
        for (String txt : lista) {
            if (txt.equals(cadena)) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    boolean method2(String text, List<String> notStrings) {
        if (notStrings != null && !notStrings.isEmpty() && text != null && text.length() > 0) {
            for (int x = 0; x < notStrings.size(); x++) {
                String notName = notStrings.get(x);
                if (text.indexOf(notName) > -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
