package inequivalent;

public class ClonePair8328 {

    boolean method1(String saida, String gabarito) {
        try {
            int nro1 = Integer.parseInt(saida);
            int nro2 = Integer.parseInt(gabarito);
            if (nro1 == nro2) {
                return true;
            }
        } catch (NumberFormatException ex) {
            if (saida.contains(gabarito)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String s, String test) {
        if (s.length() < test.length()) return false;
        for (int i = 0; i < test.length(); i++) {
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i))) return false;
        }
        return true;
    }
}
