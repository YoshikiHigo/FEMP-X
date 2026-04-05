package all;

public class ClonePair1605 {

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

    Integer method2(Object value){
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
}
