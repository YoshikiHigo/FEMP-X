package equivalent;

public class ClonePair4078 {
    boolean method1(String[] groupSet0, String[] groupSet1) {
        if (groupSet0.length != groupSet1.length) return false;
        iLoop:
        for (int i = 0; i < groupSet0.length; i++) {
            for (int j = 0; j < groupSet1.length; j++) {
                if (groupSet0[i].equals(groupSet1[j])) {
                    continue iLoop;
                }
            }
            return false;
        }
        return true;
    }

    boolean method2(String[] termos1, String[] termos2) {
        if (termos1.length != termos2.length) {
            return false;
        }
        for (int i = 0; i < termos1.length; i++) {
            if (!termos1[i].equals(termos2[i])) {
                return false;
            }
        }
        return true;
    }
}
