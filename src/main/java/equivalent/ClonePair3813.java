package equivalent;

import java.util.LinkedList;
import java.util.List;

public class ClonePair3813 {
    List<String> method1(List<String> cods) {
        List<String> aux = new LinkedList<String>();
        for (String s : cods) {
            if (s.charAt(3) != '0') {
                aux.add(s);
            }
        }
        return aux;
    }

    List<String> method2(List<String> cods) {
        List<String> aux = new LinkedList<String>();
        for (String s : cods) {
            if (s.charAt(3) != '0') {
                aux.add(s);
            }
        }
        return aux;
    }
}
