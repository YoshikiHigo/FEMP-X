package all;

public class ClonePair3581 {

    Double method1(Object obj){
      if (obj == null) {
        return null;
      }
     else   if (obj instanceof Number) {
        return new Double(((Number)obj).doubleValue());
      }
     else   if (obj instanceof Boolean) {
        return obj.equals(Boolean.FALSE) ? new Double(0.0) : new Double(-1.0);
      }
     else {
        try {
          return Double.valueOf(obj.toString());
        }
     catch (    final Throwable t) {
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
