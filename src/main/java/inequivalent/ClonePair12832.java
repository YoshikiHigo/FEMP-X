package inequivalent;

public class ClonePair12832 {

    boolean method1(Class[] p1, Class[] p2) {
        if (p1.length == p2.length) {
            for (int i = 0; i < p1.length; i++) if (!p1[i].equals(p2[i])) return false;
            return true;
        }
        return false;
    }

    boolean method2(Class[] ent1, Class[] ent2) {
        boolean returnValue = (ent1.length == ent2.length);
        Class testEnt1, testEnt2;
        for (int i = 0; returnValue && i < ent1.length; i++) {
            testEnt1 = ent1[i];
            boolean keepgoing = true;
            for (int j = 0; keepgoing && returnValue && j < ent2.length; j++) {
                testEnt2 = ent2[j];
                if (testEnt1.equals(testEnt2)) {
                    keepgoing = false;
                }
            }
            if (keepgoing) {
                returnValue = false;
            }
        }
        return returnValue;
    }
}
