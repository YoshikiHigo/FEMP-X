package all;

import java.util.Vector;

public class ClonePair1936 {

    boolean method1(Vector vector1,Vector vector2){
      if (vector1 == vector2) {
        return true;
      }
      if (vector1.size() != vector2.size()) {
        return false;
      }
      for (int index=0; index < vector1.size(); index++) {
        Object element1=vector1.elementAt(index);
        Object element2=vector2.elementAt(index);
        if (element1 == null) {
          if (element2 != null) {
            return false;
          }
        }
     else {
          if (!element1.equals(element2)) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(Vector list1,Vector list2){
      if (list1.size() != list2.size())   return false;
      for (int i=0; i < list1.size(); i++) {
        if (!list2.contains(list1.elementAt(i)))     return false;
      }
      return true;
    }
}
