package unverified;

public class ClonePair3579 {

    Double method1(Object value){
      if (value instanceof Double) {
        return (Double)value;
      }
     else   if (value instanceof Number) {
        return ((Number)value).doubleValue();
      }
     else   if (value instanceof String) {
        try {
          return Double.valueOf((String)value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }

    Double method2(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Double) {
        return (Double)value;
      }
     else   if (value instanceof Number) {
        return ((Number)value).doubleValue();
      }
      return null;
    }
}
