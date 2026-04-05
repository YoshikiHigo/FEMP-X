package unverified;

public class ClonePair1659 {

    Integer method1(Object value){
      if (value instanceof Integer) {
        return (Integer)value;
      }
     else   if (value instanceof String) {
        try {
          return Integer.parseInt((String)value);
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
     else {
        return null;
      }
    }

    Integer method2(Object o){
      if (o == null || o instanceof Integer) {
        return (Integer)o;
      }
      return null;
    }
}
