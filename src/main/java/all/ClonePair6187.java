package all;

import java.util.*;

public class ClonePair6187 {

    boolean method1(List<String> l1,List<String> l2){
      boolean retcode=(l1 == null ? (l2 == null) : (l2 != null && l1.size() == l2.size()));
      if (retcode == true && l1 != null) {
        final Iterator<String> lit=l1.iterator();
        while (lit.hasNext() == true && retcode == true) {
          retcode=l2.contains(lit.next());
        }
      }
      return (retcode);
    }

    boolean method2(List<String> t1,List<String> t2){
      if (t1 == null && t2 == null) {
        return true;
      }
     else {
        if (t1 == null || t2 == null) {
          return false;
        }
      }
      if (t1.isEmpty() && t2.isEmpty()) {
        return true;
      }
      return t1.size() == t2.size() && new HashSet<String>(t1).equals(new HashSet<String>(t2));
    }
}
