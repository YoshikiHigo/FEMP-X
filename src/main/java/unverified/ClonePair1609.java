package unverified;

public class ClonePair1609 {

    Integer method1(Object value){
      if (value instanceof Integer) {
        return (Integer)value;
      }
     else   if (value instanceof Number) {
        return ((Number)value).intValue();
      }
     else   if (value instanceof String) {
        try {
          return (int)Double.parseDouble((String)value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }

    Integer method2(Object o){
      if (o == null || o instanceof Integer) {
        return (Integer)o;
      }
      return null;
    }
}
