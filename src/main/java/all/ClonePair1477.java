package all;

public class ClonePair1477 {

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

    int method2(Object obj){
      int number=0;
      if (obj != null) {
        if (obj instanceof Double) {
          number=((Double)obj).intValue();
        }
     else     if (obj instanceof Float) {
          number=((Float)obj).intValue();
        }
     else     if (obj instanceof Integer) {
          number=(Integer)obj;
        }
     else     if (obj instanceof String) {
          try {
            number=Integer.parseInt((String)obj);
          }
     catch (      Exception ex) {
          }
        }
      }
      return number;
    }
}
