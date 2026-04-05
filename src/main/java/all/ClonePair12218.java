package all;

import java.util.List;

public class ClonePair12218 {

    boolean method1(List l1,List l2){
      if ((l1 == null) || (l2 == null)) {
        if (l1 == l2)     return true;
     else     return false;
      }
      if (l1.size() != l2.size())   return false;
      for (int i=0; i < l1.size(); i++) {
        if (l1.get(i).toString().compareToIgnoreCase(l2.get(i).toString()) != 0)     return false;
      }
      return true;
    }

    boolean method2(List l1,List l2){
      if ((l1 == null) || (l2 == null)) {
        if (l1 == l2)     return true;
     else     return false;
      }
      if (l1.size() != l2.size())   return false;
      for (int i=0; i < l1.size(); i++) {
        if (l1.get(i).toString().compareTo(l2.get(i).toString()) != 0)     return false;
      }
      return true;
    }
}
