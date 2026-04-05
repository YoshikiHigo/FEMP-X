package unverified;

public class ClonePair1600 {

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
