package all;

public class ClonePair1634 {

    Integer method1(Object obj){
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
