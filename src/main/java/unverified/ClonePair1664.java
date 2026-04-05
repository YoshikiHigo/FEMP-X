package unverified;

public class ClonePair1664 {

    Integer method1(Object obj){
      if (obj == null) {
        return null;
      }
      try {
        if (obj instanceof Number) {
          return new Integer(((Number)obj).intValue());
        }
        if (obj instanceof Boolean) {
          return obj.equals(Boolean.FALSE) ? new Integer(0) : new Integer(-1);
        }
        return Integer.valueOf(obj.toString().trim());
      }
     catch (  final Throwable t) {
        try {
          return Integer.valueOf(obj.toString().trim());
        }
     catch (    final Throwable ta) {
        }
      }
      return null;
    }

    Integer method2(Object o){
      if (o == null || o instanceof Integer) {
        return (Integer)o;
      }
      return null;
    }
}
