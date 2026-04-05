package all;

public class ClonePair1478 {

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

    int method2(Object aValue){
      int out=0;
      if (aValue == null)   return out;
      if (aValue instanceof Integer) {
        try {
          Integer i=(Integer)aValue;
          out=i.intValue();
        }
     catch (    Exception ex) {
        }
      }
     else   if (aValue instanceof String) {
        String s=(String)aValue;
        if (s.length() > 0) {
          try {
            out=Integer.parseInt(s);
          }
     catch (      Exception ex) {
          }
        }
      }
      return out;
    }
}
