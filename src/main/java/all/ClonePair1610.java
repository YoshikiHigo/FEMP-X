package all;

public class ClonePair1610 {

    Integer method1(Object value){
      if (value instanceof Integer) {
        return (Integer)value;
      }
     else   if (value instanceof Number) {
        if (value.equals(Float.NaN) || value.equals(Double.NaN)) {
          return null;
        }
        Number number=(Number)value;
        return number.intValue();
      }
     else   if (value instanceof String) {
        return Integer.valueOf((String)value);
      }
     else {
        return null;
      }
    }

    Integer method2(Object obj){
      if (obj != null) {
        if (obj instanceof Integer) {
          return (Integer)obj;
        }
        if (obj instanceof String) {
          return Integer.valueOf((String)obj);
        }
      }
      return null;
    }
}
