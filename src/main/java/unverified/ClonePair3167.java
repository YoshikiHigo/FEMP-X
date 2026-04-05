package unverified;

public class ClonePair3167 {

    long method1(Object o){
      if (o instanceof Number)   return ((Number)o).longValue();
     else   return Long.parseLong(o.toString());
    }

    long method2(Object o){
      if (o instanceof Number) {
        return ((Number)o).longValue();
      }
     else   if (o instanceof Boolean) {
        boolean b=((Boolean)o).booleanValue();
        return b ? 1 : 0;
      }
     else {
        return Long.parseLong(o.toString());
      }
    }
}
