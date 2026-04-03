package inequivalent;

public class ClonePair12614 {

    boolean method1(String sStr, String[] aSet) {
        boolean bRetVal = false;
        if (aSet != null) {
            final int iLen = aSet.length;
            for (int i = 0; i < iLen && !bRetVal; i++) bRetVal = sStr.equalsIgnoreCase(aSet[i]);
        }
        return bRetVal;
    }

    boolean method2(String name, String[] filters) {
        if (filters == null) return false;
        for (String filter : filters) {
            if (name.equals(filter)) return true;
        }
        return false;
    }
}
