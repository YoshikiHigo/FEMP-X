package all;

public class ClonePair1480 {

    int method1(Object obj){
      if (obj == null) {
        return 0;
      }
     else   if (obj instanceof Number) {
        return ((Number)obj).intValue();
      }
     else   if (obj instanceof String) {
        try {
          return Integer.parseInt((String)obj);
        }
     catch (    NumberFormatException e) {
        }
      }
      return 0;
    }

    int method2(Object value){
      if (value != null) {
        if (value instanceof Integer) {
          return ((Integer)value).intValue();
        }
     else     if (value instanceof Long) {
          return (int)((Long)value).longValue();
        }
     else     if (value instanceof Short) {
          return ((Short)value).shortValue();
        }
     else {
          try {
            return Integer.parseInt(value.toString());
          }
     catch (      NumberFormatException e) {
            return 0;
          }
        }
      }
     else {
        return 0;
      }
    }
}
