package unverified;

public class ClonePair3583 {

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

    Double method2(Object obj){
      if (obj == null)   return null;
      if (obj instanceof Number)   return new Double(((Number)obj).doubleValue());
      if (obj instanceof Boolean)   return (obj.equals(Boolean.FALSE)) ? new Double(0.0) : new Double(-1.0);
      try {
        return Double.valueOf(obj.toString());
      }
     catch (  Throwable t) {
      }
      return null;
    }
}
