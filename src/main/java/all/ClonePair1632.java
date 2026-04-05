package all;

public class ClonePair1632 {

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

    Integer method2(Object obj){
      if (obj == null) {
        return null;
      }
     else   if (obj instanceof Number) {
        return new Integer(((Number)obj).intValue());
      }
     else   if (obj instanceof Boolean) {
        return obj.equals(Boolean.FALSE) ? new Integer(0) : new Integer(-1);
      }
     else {
        try {
          return Integer.valueOf(obj.toString());
        }
     catch (    final Throwable t) {
        }
      }
      return null;
    }
}
