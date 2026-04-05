package all;

public class ClonePair3576 {

    Double method1(Object input){
      if (input == null) {
        return null;
      }
     else   if (input instanceof Double) {
        return (Double)input;
      }
     else   if (input instanceof Integer) {
        return ((Integer)input).doubleValue();
      }
     else   if (input instanceof String) {
        return null;
      }
     else {
        return null;
      }
    }

    Double method2(Object obj){
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
}
