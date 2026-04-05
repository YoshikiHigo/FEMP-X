package all;

public class ClonePair3567 {

    Double method1(Object value){
      if (value instanceof Number)   return ((Number)value).doubleValue();
     else   if (value instanceof String) {
        try {
          return Double.valueOf(((String)(value)).trim());
        }
     catch (    NumberFormatException nfe) {
          return null;
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
