package inequivalent;

import java.util.List;

public class ClonePair9178 {

    String method1(List<String> ls) {
        String prev = "";
        String s0 = ls.get(0);
        for (int i = 1; i <= s0.length(); i++) {
            String test = s0.substring(0, i);
            for (String s : ls) {
                if (!s.startsWith(test)) {
                    return prev;
                }
            }
            prev = test;
        }
        return prev;
    }

    String method2(List<String> list) {
        String smallestElement = list.get(0);
        for (String element : list) {
            if (element.compareTo(smallestElement) < 0) {
                smallestElement = element;
            }
        }
        return smallestElement;
    }
}
