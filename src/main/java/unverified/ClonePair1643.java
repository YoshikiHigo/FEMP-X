package unverified;

public class ClonePair1643 {

    Integer method1(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Integer) {
        return (Integer)value;
      }
      if (value instanceof Number) {
        return Integer.valueOf(((Number)value).intValue());
      }
      return Integer.valueOf(value.toString());
    }

    Integer method2(Object value){
      if (value != null) {
        if (value instanceof Integer) {
          return (Integer)value;
        }
     else     if (value instanceof Number) {
          return ((Number)value).intValue();
        }
     else {
          int intValue=Integer.parseInt(value.toString());
          return intValue;
        }
      }
      return null;
    }
}
