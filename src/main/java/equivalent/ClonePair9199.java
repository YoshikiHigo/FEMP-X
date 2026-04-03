package equivalent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ClonePair9199 {
    String method1(String name, ArrayList scopes) {
        if (name == null) {
            return null;
        }
        String qualName = "";
        TreeSet sortedScopes;
        if (scopes != null) {
            sortedScopes = new TreeSet(scopes);
        } else {
            sortedScopes = new TreeSet();
        }
        Iterator scIt = sortedScopes.iterator();
        while (scIt.hasNext()) {
            String id = (String) scIt.next();
            qualName = qualName.concat(id);
            qualName = qualName.concat(".");
        }
        return qualName.concat(name);
    }

    String method2(String name, ArrayList scopes) {
        if (name == null) {
            return null;
        }
        String qualName = "";
        TreeSet sortedScopes;
        if (scopes != null) {
            sortedScopes = new TreeSet(scopes);
        } else {
            sortedScopes = new TreeSet();
        }
        Iterator scIt = sortedScopes.iterator();
        while (scIt.hasNext()) {
            String id = (String) scIt.next();
            qualName = qualName.concat(id);
            qualName = qualName.concat(".");
        }
        String ret = qualName.concat(name);
        return ret;
    }
}
