package unverified;

public class ClonePair3168 {

    long method1(Object value){
      if (value instanceof Number) {
        Number n=(Number)value;
        return n.longValue();
      }
      return Long.parseLong(value.toString());
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
