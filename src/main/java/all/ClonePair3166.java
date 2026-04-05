package all;

public class ClonePair3166 {

    long method1(Object o){
      if (o instanceof Number)   return ((Number)o).longValue();
     else   return Long.parseLong(o.toString());
    }

    long method2(Object value){
      if (value instanceof Number) {
        Number n=(Number)value;
        return n.longValue();
      }
      return Long.parseLong(value.toString());
    }
}
