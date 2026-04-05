package unverified;

public class ClonePair1622 {

    Integer method1(Object input){
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

    Integer method2(Object obj){
      if (obj == null)   return null;
      if (obj instanceof Number)   return new Integer(((Number)obj).intValue());
      if (obj instanceof Boolean)   return (obj.equals(Boolean.FALSE)) ? new Integer(0) : new Integer(-1);
      try {
        return Integer.valueOf(obj.toString());
      }
     catch (  Throwable t) {
      }
      return null;
    }
}
