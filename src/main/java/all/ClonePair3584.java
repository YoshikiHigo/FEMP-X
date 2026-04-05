package all;

public class ClonePair3584 {

    Double method1(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Double) {
        return (Double)value;
      }
      if (value instanceof Number) {
        return Double.valueOf(((Number)value).doubleValue());
      }
      return Double.valueOf(value.toString());
    }

    Double method2(Object value){
      if (value != null) {
        if (value instanceof Double) {
          return (Double)value;
        }
     else     if (value instanceof Number) {
          return Double.valueOf(((Number)value).doubleValue());
        }
     else {
          double doubleValue=Double.parseDouble(value.toString());
          return Double.valueOf(doubleValue);
        }
      }
      return null;
    }
}
