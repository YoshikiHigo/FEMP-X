package unverified;

public class ClonePair1648 {

    Integer method1(Object value){
      if (value != null) {
        return Integer.parseInt(String.valueOf(value));
      }
      return null;
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
