package all;

public class ClonePair3649 {

    int method1(Object a,Object b){
      if (a == b)   return 0;
      if (a == null)   return -1;
      if (b == null)   return 1;
      boolean ba=((Boolean)a).booleanValue();
      boolean bb=((Boolean)b).booleanValue();
      return (ba == bb) ? 0 : ba ? 1 : -1;
    }

    int method2(Object obj1,Object obj2){
      if (obj1 != null) {
        return (obj2 != null) ? ((Comparable)obj1).compareTo(obj2) : 1;
      }
     else {
        return (obj2 != null) ? -1 : 0;
      }
    }
}
