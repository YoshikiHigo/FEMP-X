package all;

import java.util.Locale;

public class ClonePair3655 {

    int method1(Object o1,Object o2){
      if (o1 instanceof String && o2 instanceof String) {
        return ((String)o1).toLowerCase(Locale.ENGLISH).compareTo(((String)o2).toLowerCase(Locale.ENGLISH));
      }
      return ((Comparable)o1).compareTo(o2);
    }

    int method2(Object o1,Object o2){
      if (o1 instanceof Number && o2 instanceof Number) {
        double n1=((Number)o1).doubleValue();
        double n2=((Number)o2).doubleValue();
        if (n1 > n2) {
          return 1;
        }
     else     if (n1 == n2) {
          return 0;
        }
     else {
          return -1;
        }
      }
     else {
        return ((Comparable)o1).compareTo(o2);
      }
    }
}
