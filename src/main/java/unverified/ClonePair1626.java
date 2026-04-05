package unverified;

public class ClonePair1626 {

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
}
