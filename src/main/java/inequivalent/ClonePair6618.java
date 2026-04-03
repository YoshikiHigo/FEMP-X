package inequivalent;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ClonePair6618 {

    boolean method1(String pName1, String pName2) {
        String[] name1TokensArray = pName1.split(" ");
        String[] name2TokensArray = pName2.split(" ");
        Set<String> name1Set = new HashSet<String>();
        Collections.addAll(name1Set, name1TokensArray);
        Set<String> name2Set = new HashSet<String>();
        Collections.addAll(name2Set, name2TokensArray);
        int name1SetSize = name1Set.size();
        int name2SetSize = name2Set.size();
        if (Math.abs(name1SetSize - name2SetSize) > 1) {
            return false;
        }
        Set<String> nameASet = name1Set;
        Set<String> nameBSet = name2Set;
        if (name1SetSize > name2SetSize) {
            nameASet = name2Set;
            nameBSet = name1Set;
        }
        return nameASet.containsAll(nameBSet);
    }

    boolean method2(String sub, String s) {
        if (sub.length() != s.length()) return false;
        char[] csub = sub.toCharArray();
        char[] c = s.toCharArray();
        for (int i = 0; i < csub.length; i++) {
            if (csub[i] != '0' && c[i] == '0') return false;
        }
        return true;
    }
}
