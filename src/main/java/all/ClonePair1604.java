package all;

public class ClonePair1604 {

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
