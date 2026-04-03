package inequivalent;

import java.util.Iterator;
import java.util.TreeSet;

public class ClonePair6671 {

    String method1(Iterable iIterable, String sSeparator) {
        StringBuffer sOut = new StringBuffer();
        Iterator iIter = iIterable.iterator();
        TreeSet<String> tsItems = new TreeSet<String>();
        while (iIter.hasNext()) {
            tsItems.add(iIter.next().toString());
        }
        for (Iterator<String> isCur = tsItems.iterator(); isCur.hasNext(); ) {
            sOut.append(isCur.next());
            if (isCur.hasNext()) sOut.append(sSeparator);
        }
        return sOut.toString();
    }

    String method2(Iterable list, String s) {
        String r = "";
        for (Object a : list) r = r + a + s;
        if (r.length() >= s.length()) r = r.substring(0, r.length() - s.length());
        return r;
    }
}
