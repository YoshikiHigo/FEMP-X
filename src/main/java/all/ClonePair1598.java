package all;

public class ClonePair1598 {

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

    Integer method2(Object input){
      if (input == null) {
        return null;
      }
     else   if (input instanceof Double) {
        return ((Double)input).intValue();
      }
     else   if (input instanceof Integer) {
        return (Integer)input;
      }
     else   if (input instanceof String) {
        return null;
      }
     else {
        return null;
      }
    }
}
