package all;

public class ClonePair6505 {

    double method1(Object value){
      if (value instanceof Number) {
        Number n=(Number)value;
        return n.doubleValue();
      }
      return Double.parseDouble(value.toString());
    }

    double method2(Object x){
      if (x instanceof Integer)   return ((Integer)x).longValue();
      if (x instanceof Long)   return (Long)x;
      if (x instanceof Double)   return (Double)x;
      return Double.parseDouble(x.toString());
    }
}
